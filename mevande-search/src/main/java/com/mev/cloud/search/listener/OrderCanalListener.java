package com.mev.cloud.search.listener;

import cn.throwx.canal.gule.model.CanalBinLogEvent;
import cn.throwx.canal.gule.model.CanalBinLogResult;
import cn.throwx.canal.gule.support.processor.BaseCanalBinlogEventProcessor;
import cn.throwx.canal.gule.support.processor.ExceptionHandler;
import com.mev.cloud.api.order.bo.EsOrderBO;
import com.mev.cloud.api.order.feign.OrderFeignClient;
import com.mev.cloud.common.exception.MevandeException;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.util.Json;
import com.mev.cloud.search.bo.OrderBO;
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
 * 订单的监听
 * @author Alphaoumardev
 * @date 2021/02/03
 */
@Component
public class OrderCanalListener extends BaseCanalBinlogEventProcessor<OrderBO> {

    private static final Logger log = LoggerFactory.getLogger(OrderCanalListener.class);

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    /**
     * 插入订单，此时插入es
     */
    @Override
    protected void processInsertInternal(CanalBinLogResult<OrderBO> result) {
        Long orderId = result.getPrimaryKey();

        ServerResponseEntity<EsOrderBO> esOrderResponse = orderFeignClient.getEsOrder(orderId);
        IndexRequest request = new IndexRequest(EsIndexEnum.ORDER.value());
        request.id(String.valueOf(orderId));
        request.source(Json.toJsonString(esOrderResponse.getData()), XContentType.JSON);
        try {
            IndexResponse indexResponse = restHighLevelClient.index(request, RequestOptions.DEFAULT);
            log.info(indexResponse.toString());
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.toString());
            throw new MevandeException("保存es信息异常", e);
        }
    }

    /**
     * 更新订单，删除订单索引，再重新构建一个
     */
    @Override
    protected void processUpdateInternal(CanalBinLogResult<OrderBO> result) {
        Long orderId = result.getPrimaryKey();
        ServerResponseEntity<EsOrderBO> esOrderResponse = orderFeignClient.getEsOrder(orderId);
        UpdateRequest request = new UpdateRequest(EsIndexEnum.ORDER.value(), String.valueOf(orderId));
        request.doc(Json.toJsonString(esOrderResponse.getData()), XContentType.JSON);
        request.docAsUpsert(true);
        try {
            UpdateResponse updateResponse = restHighLevelClient.update(request, RequestOptions.DEFAULT);
            log.info(updateResponse.toString());
        } catch (IOException e) {
            log.error(e.toString());
            throw new MevandeException("更新订单es信息异常",e);
        }
    }

    @Override
    protected ExceptionHandler exceptionHandler() {
        return (CanalBinLogEvent event, Throwable throwable) -> {
            throw new MevandeException("创建索引异常",throwable);
        };
    }
}
