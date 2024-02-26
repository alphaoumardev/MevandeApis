package com.mev.cloud.api.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/22
 */
@Setter
@Getter
public class SkuStockLockDTO {

    @NotNull(message = "产品ID不能为空")
    @Schema(description = "产品ID" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private Long spuId;

    @NotNull(message = "skuId不能为空")
    @Schema(description = "skuId" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private Long skuId;

    @NotNull(message = "orderId不能为空")
    @Schema(description = "orderId" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private Long orderId;

    @NotNull(message = "商品数量不能为空")
    @Min(value = 1,message = "商品数量不能为空")
    @Schema(description = "商品数量" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer count;

    public SkuStockLockDTO() {
    }

    public SkuStockLockDTO(Long spuId, Long skuId, Long orderId, Integer count) {
        this.spuId = spuId;
        this.skuId = skuId;
        this.orderId = orderId;
        this.count = count;
    }

    @Override
    public String toString() {
        return "SkuStockLockDTO{" +
                "spuId=" + spuId +
                ", skuId=" + skuId +
                ", orderId=" + orderId +
                ", count=" + count +
                '}';
    }
}
