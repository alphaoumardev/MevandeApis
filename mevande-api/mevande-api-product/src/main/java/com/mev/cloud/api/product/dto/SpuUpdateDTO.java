package com.mev.cloud.api.product.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/11/12
 */
@Setter
@Getter
public class SpuUpdateDTO implements Serializable {

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 分类id列表
     */
    private List<Long> categoryIds;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类等级
     */
    private Integer categoryLevel;

    /**
     * 商品状态
     */
    private Integer status;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 店铺名称 搜索华为的时候，可以把华为的旗舰店搜索出来
     */
    private String shopName;

    /**
     * 店铺logo
     */
    private String shopImg;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌图片
     */
    private String brandImg;

    /**
     * 品牌名称
     */
    private String brandName;

    @Override
    public String toString() {
        return "SpuUpdateDTO{" +
                "categoryId=" + categoryId +
                ", categoryIds=" + categoryIds +
                ", categoryName='" + categoryName + '\'' +
                ", categoryLevel=" + categoryLevel +
                ", status=" + status +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopImg='" + shopImg + '\'' +
                ", brandId=" + brandId +
                ", brandImg='" + brandImg + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
