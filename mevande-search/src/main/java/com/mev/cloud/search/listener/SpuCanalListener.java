package com.mev.cloud.search.listener;

import cn.throwx.canal.gule.model.CanalBinLogEvent;
import cn.throwx.canal.gule.model.CanalBinLogResult;
import cn.throwx.canal.gule.support.processor.BaseCanalBinlogEventProcessor;
import cn.throwx.canal.gule.support.processor.ExceptionHandler;
import com.mev.cloud.api.product.bo.EsProductBO;
import com.mev.cloud.api.product.feign.ProductFeignClient;
import com.mev.cloud.common.exception.MevandeException;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.util.Json;
import com.mev.cloud.search.bo.SpuBO;
import com.mev.cloud.search.constant.EsIndexEnum;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author Alphaoumardev
 * @date 2020/11/13
 */
@Component
public class SpuCanalListener extends BaseCanalBinlogEventProcessor<SpuBO> {

    private static final Logger log = LoggerFactory.getLogger(SpuCanalListener.class);

    @Autowired
    private ProductFeignClient productFeignClient;

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    /**
     * 插入商品，此时插入es
     */
    @Override
    protected void processInsertInternal(CanalBinLogResult<SpuBO> result) {
        Long spuId = result.getPrimaryKey();
        ServerResponseEntity<EsProductBO> esProductBO = productFeignClient.loadEsProductBO(spuId);
        if (!esProductBO.isSuccess()) {
            throw new MevandeException("创建索引异常");
        }

        IndexRequest request = new IndexRequest(EsIndexEnum.PRODUCT.value());
        request.id(String.valueOf(spuId));
        request.source(Json.toJsonString(esProductBO.getData()), XContentType.JSON);
        try {
            IndexResponse indexResponse = restHighLevelClient.index(request, RequestOptions.DEFAULT);
            log.info(indexResponse.toString());

        } catch (IOException e) {
            log.error(e.toString());
            throw new MevandeException("保存es信息异常", e);
        }
    }

    /**
     * 更新商品，删除商品索引，再重新构建一个
     */
    @Override
    protected void processUpdateInternal(CanalBinLogResult<SpuBO> result) {
        Long spuId = result.getPrimaryKey();
        ServerResponseEntity<EsProductBO> esProductBO = productFeignClient.loadEsProductBO(spuId);
        String source = Json.toJsonString(esProductBO.getData());
        UpdateRequest request = new UpdateRequest(EsIndexEnum.PRODUCT.value(), String.valueOf(spuId));
        request.doc(source, XContentType.JSON);
        request.docAsUpsert(true);
        try {
            UpdateResponse updateResponse = restHighLevelClient.update(request, RequestOptions.DEFAULT);
            log.info(updateResponse.toString());
        } catch (IOException e) {
            log.error(e.toString());
            throw new MevandeException("删除es信息异常",e);
        }
    }

    @Override
    protected ExceptionHandler exceptionHandler() {
        return (CanalBinLogEvent event, Throwable throwable) -> {
            throw new MevandeException("创建索引异常",throwable);
        };
    }
}
