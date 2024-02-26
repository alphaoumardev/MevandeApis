package com.mev.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/11/17
 */
@Setter
@Getter
public class BrandSearchVO
{

    @Schema(description = "品牌名称" )
    private String brandName;

    @Schema(description = "品牌id" )
    private Long brandId;

    @Schema(description = "品牌图片" )
    private String brandImg;

    @Override
    public String toString() {
        return "BrandVO{" +
                "brandName='" + brandName + '\'' +
                ", brandId=" + brandId +
                ", brandImg='" + brandImg + '\'' +
                '}';
    }
}
