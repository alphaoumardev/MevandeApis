package com.mev.cloud.product.dto.shopcart;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alphaoumardev
 * @date 2021-02-03 15:47:32
 */
@Setter
@Getter
@ToString
public class CheckShopCartItemDTO {

    @NotNull
    @Schema(description = "购物车ID" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long shopCartItemId;

    @NotNull
    @Schema(description = "商品是否勾选 1:勾选 0:未勾选" )
    private Integer isChecked;

}
