package com.mev.cloud.multishop.controller.multishop;

import com.mev.cloud.api.multishop.vo.ShopDetailVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.security.AuthUserContext;
import com.mev.cloud.multishop.service.ShopDetailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alphaoumardev
 * @Date 2021/6/24 14:46
 */
@RequestMapping(value = "/m/shop_detail")
@RestController("multishopShopDetailController")
@Tag(name = "multishop-店铺详情信息")
public class ShopDetailController {

    @Autowired
    private ShopDetailService shopDetailService;

    @GetMapping("/info")
    @Operation(summary = "获取店铺详情信息" , description = "获取店铺详情信息")
    public ServerResponseEntity<ShopDetailVO> info() {
        Long shopId = AuthUserContext.get().getTenantId();
        ShopDetailVO shopDetailVO = shopDetailService.getByShopId(shopId);
        return ServerResponseEntity.success(shopDetailVO);
    }
}
