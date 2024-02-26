package com.mev.cloud.common.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 多个店铺订单合并在一起的合并类
 * "/confirm" 使用
 * @author Alphaoumardev
 */
@Setter
@Getter
public class ShopCartOrderMergerVO
{

    @Schema(description = "商品总值" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long total;

    @Schema(description = "商品总数" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer totalCount;

    @Schema(description = "配送类型 ：无需快递" )
    private Integer dvyType;

    @Schema(description = "过滤掉的商品项" , requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ShopCartItemVO> filterShopItems;

    @Schema(description = "每个店铺的订单信息" , requiredMode = Schema.RequiredMode.REQUIRED)
    List<ShopCartOrderVO> shopCartOrders;

    @Schema(description = "用户地址" )
    private UserAddrVO userAddr;


    @Override
    public String toString() {
        return "ShopCartOrderMergerVO{" +
                "total=" + total +
                ", totalCount=" + totalCount +
                ", dvyType=" + dvyType +
                ", filterShopItems=" + filterShopItems +
                ", shopCartOrders=" + shopCartOrders +
                ", userAddr=" + userAddr +
                '}';
    }
}
