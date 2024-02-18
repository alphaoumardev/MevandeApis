package com.mev.cloud.product.feign;

import com.mev.cloud.api.product.feign.SkuFeignClient;
import com.mev.cloud.api.product.vo.SkuVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.product.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alphaoumardev
 * @date 2020/12/8
 */
@RestController
public class SkuFeignController implements SkuFeignClient {

    @Autowired
    private SkuService skuService;


    @Override
    public ServerResponseEntity<SkuVO> getById(Long skuId) {
        return ServerResponseEntity.success(skuService.getSkuBySkuId(skuId));
    }
}
