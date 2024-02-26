package com.mev.cloud.api.product.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/8
 */
@Setter
@Getter
public class SpuAndSkuVO
{
    @Schema(description = "spu信息" )
    private SpuVO spu;

    @Schema(description = "sku信息" )
    private SkuVO sku;

    @Override
    public String toString() {
        return "SpuAndSkuVO{" +
                "spu=" + spu +
                ", sku=" + sku +
                '}';
    }
}
