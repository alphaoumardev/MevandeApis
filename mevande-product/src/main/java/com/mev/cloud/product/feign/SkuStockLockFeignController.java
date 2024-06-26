package com.mev.cloud.product.feign;

import com.mev.cloud.api.product.dto.SkuStockLockDTO;
import com.mev.cloud.api.product.feign.SkuStockLockFeignClient;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.product.service.*;
import com.mev.cloud.product.service.SkuStockLockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/12/8
 */
@RestController
public class SkuStockLockFeignController implements SkuStockLockFeignClient {


    @Autowired
    private SkuStockLockService skuStockLockService;

    @Override
    public ServerResponseEntity<Void> lock(List<SkuStockLockDTO> skuStockLocksParam) {
        return skuStockLockService.lock(skuStockLocksParam);
    }
}
