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
public class SpuSearchVO
{

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "商品名称" )
    private String spuName;

    @Schema(description = "卖点" )
    private String sellingPoint;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "商品售价" )
    private Long priceFee;

    @Schema(description = "市场价，整数方式保存" )
    private Long marketPriceFee;

    @Schema(description = "是否有库存" )
    private Boolean hasStock;

    @Schema(description = "销量" )
    private Integer saleNum;

    @Schema(description = "商品介绍主图" )
    private String mainImgUrl;

    @Override
    public String toString() {
        return "SpuVO{" +
                "spuId=" + spuId +
                ", spuName='" + spuName + '\'' +
                ", sellingPoint='" + sellingPoint + '\'' +
                ", priceFee=" + priceFee +
                ", marketPriceFee=" + marketPriceFee +
                ", hasStock=" + hasStock +
                ", saleNum=" + saleNum +
                ", mainImgUrl='" + mainImgUrl + '\'' +
                '}';
    }
}
