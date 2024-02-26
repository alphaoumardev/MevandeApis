package com.mev.cloud.common.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/12/14
 */
@Setter
@Getter
public class ShopCartWithAmountVO
{

    @Schema(description = "总额" )
    private Long totalMoney;

    @Schema(description = "总计" )
    private Long finalMoney;

    @Schema(description = "商品数量" )
    private Integer count;

    @Schema(description = "多个店铺的购物车信息" )
    private List<ShopCartVO> shopCarts;

    @Override
    public String toString() {
        return "ShopCartWithAmountVO{" +
                "totalMoney=" + totalMoney +
                ", finalMoney=" + finalMoney +
                ", count=" + count +
                ", shopCarts=" + shopCarts +
                '}';
    }
}
