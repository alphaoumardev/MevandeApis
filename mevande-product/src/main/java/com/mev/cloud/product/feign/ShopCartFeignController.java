package com.mev.cloud.product.feign;

import cn.hutool.core.collection.CollectionUtil;
import com.mev.cloud.api.product.feign.ShopCartFeignClient;
import com.mev.cloud.common.order.vo.ShopCartItemVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.common.security.AuthUserContext;
import com.mev.cloud.product.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/12/8
 */
@RestController
public class ShopCartFeignController implements ShopCartFeignClient {

    @Autowired
    private ShopCartService shopCartService;

    @Override
    public ServerResponseEntity<List<ShopCartItemVO>> getCheckedShopCartItems() {
        List<ShopCartItemVO> checkedShopCartItems = shopCartService.getCheckedShopCartItems();
        if (CollectionUtil.isNotEmpty(checkedShopCartItems)) {
            for (ShopCartItemVO shopCartItem : checkedShopCartItems) {
                shopCartItem.setTotalAmount(shopCartItem.getCount() * shopCartItem.getSkuPriceFee());
            }
        }
        return ServerResponseEntity.success(checkedShopCartItems);
    }

    @Override
    public ServerResponseEntity<Void> deleteItem(List<Long> shopCartItemIds) {
        Long userId = AuthUserContext.get().getUserId();
        shopCartService.deleteShopCartItemsByShopCartItemIds(userId,shopCartItemIds);
        return ServerResponseEntity.success();
    }
}
