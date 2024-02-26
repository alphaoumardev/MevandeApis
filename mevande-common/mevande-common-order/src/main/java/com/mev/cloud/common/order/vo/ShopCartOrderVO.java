package com.mev.cloud.common.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 单个店铺的订单信息
 * @author Alphaoumardev
 */
@Setter
@Getter
public class ShopCartOrderVO implements Serializable{

    @Schema(description = "店铺id" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long shopId;

    @Schema(description = "店铺名称" , requiredMode = Schema.RequiredMode.REQUIRED)
    private String shopName;

    @Schema(description = "商品总值" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long total;

    @Schema(description = "购物车商品" , requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ShopCartItemVO> shopCartItemVO;

    @Schema(description = "商品总数" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer totalCount;


    @Override
    public String toString() {
        return "ShopCartOrderVO{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", total=" + total +
                ", shopCartItemVO=" + shopCartItemVO +
                ", totalCount=" + totalCount +
                '}';
    }
}
