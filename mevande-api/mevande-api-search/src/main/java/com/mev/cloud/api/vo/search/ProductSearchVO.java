package com.mev.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/11/16
 */
@Setter
@Getter
public class ProductSearchVO {


    @Schema(description = "店铺信息" )
    private ShopInfoSearchVO shopInfo;

    @Schema(description = "规格属性列表" )
    private List<AttrSearchVO> attrs;

    @Schema(description = "品牌列表信息" )
    private List<BrandSearchVO> brands;

    @Schema(description = "spu列表信息" )
    private List<SpuSearchVO> spus;

    @Schema(description = "分类列表信息" )
    private List<CategorySearchVO> categorys;

    @Override
    public String toString() {
        return "ProductSearchVO{" +
                "shopInfo=" + shopInfo +
                ", attrs=" + attrs +
                ", brands=" + brands +
                ", spus=" + spus +
                '}';
    }
}
