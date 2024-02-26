package com.mev.cloud.api.product.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/11/12
 */
@Setter
@Getter
public class EsProductBO {

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * 卖点
     */
    private String sellingPoint;

    /**
     * 商品售价
     */
    private Long priceFee;

    /**
     * 市场价，整数方式保存
     */
    private Long marketPriceFee;

    /**
     * 商品介绍主图
     */
    @JsonSerialize(using = ImgJsonSerializer.class)
    private String mainImgUrl;

    /**
     * 店铺名称 搜索华为的时候，可以把华为的旗舰店搜索出来
     */
    private String shopName;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 店铺logo
     */
    private String shopImg;

    /**
     * 店铺类型1自营店 2普通店
     */
    private Integer shopType;

    /**
     * 商品状态
     */
    private Integer spuStatus;

    /**
     * 是否有库存
     */
    private Boolean hasStock;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销量
     */
    private Integer saleNum;

    /**
     * 商品创建时间
     */
    private Date createTime;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 商品序号
     */
    private Integer seq;

    /**
     * 品牌图片
     */
    private String brandImg;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 商家一级分类id
     */
    private Long shopPrimaryCategoryId;

    /**
     * 商家一级分类名称
     */
    private String shopPrimaryCategoryName;

    /**
     * 商家二级分类id
     */
    private Long shopSecondaryCategoryId;

    /**
     * 商家二级分类名称
     */
    private String shopSecondaryCategoryName;

    /**
     * 平台一级分类id
     */
    private Long primaryCategoryId;

    /**
     * 平台一级分类名称
     */
    private String primaryCategoryName;

    /**
     * 平台二级分类id
     */
    private Long secondaryCategoryId;

    /**
     * 平台二级分类名称
     */
    private String secondaryCategoryName;

    /**
     * 商品用于搜索的规格属性
     */
    private List<EsAttrBO> attrs;

    @Override
    public String toString() {
        return "EsProductBO{" +
                "spuId=" + spuId +
                ", spuName='" + spuName + '\'' +
                ", sellingPoint='" + sellingPoint + '\'' +
                ", priceFee=" + priceFee +
                ", marketPriceFee=" + marketPriceFee +
                ", mainImgUrl='" + mainImgUrl + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopId=" + shopId +
                ", shopImg='" + shopImg + '\'' +
                ", shopType=" + shopType +
                ", spuStatus=" + spuStatus +
                ", hasStock=" + hasStock +
                ", stock=" + stock +
                ", saleNum=" + saleNum +
                ", createTime=" + createTime +
                ", brandName='" + brandName + '\'' +
                ", brandId=" + brandId +
                ", seq=" + seq +
                ", brandImg='" + brandImg + '\'' +
                ", categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", shopPrimaryCategoryId=" + shopPrimaryCategoryId +
                ", shopPrimaryCategoryName='" + shopPrimaryCategoryName + '\'' +
                ", shopSecondaryCategoryId=" + shopSecondaryCategoryId +
                ", shopSecondaryCategoryName='" + shopSecondaryCategoryName + '\'' +
                ", primaryCategoryId=" + primaryCategoryId +
                ", primaryCategoryName='" + primaryCategoryName + '\'' +
                ", secondaryCategoryId=" + secondaryCategoryId +
                ", secondaryCategoryName='" + secondaryCategoryName + '\'' +
                ", attrs=" + attrs +
                '}';
    }
}
