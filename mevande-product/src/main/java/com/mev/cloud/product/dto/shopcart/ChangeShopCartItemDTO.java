package com.mev.cloud.product.dto.shopcart;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Alphaoumardev
 * @date 2020-11-20 15:47:32
 */
@Setter
@Getter
@ToString
public class ChangeShopCartItemDTO {

    @Schema(description = "购物车ID" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long shopCartItemId;

    @NotNull(message = "商品ID不能为空")
    @Schema(description = "商品ID" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long spuId;

    @Schema(description = "旧的skuId 如果传过来说明在变更sku" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long oldSkuId;

    @NotNull(message = "skuId不能为空")
    @Schema(description = "skuId" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long skuId;

    @Schema(description = "店铺ID，前端不用传该字段" )
    private Long shopId;

    @NotNull(message = "商品个数不能为空")
    @Schema(description = "商品个数" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer count;

    @Schema(description = "商品是否勾选 true：勾选 " )
    private Boolean isCheck;


}
