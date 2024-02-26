package com.mev.cloud.api.product.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * spu信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
public class SpuVO extends BaseVO implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Schema(description = "spu id" )
	private Long spuId;

	@Schema(description = "品牌ID" )
	private Long brandId;

	@Schema(description = "分类ID" )
	private Long categoryId;

	@Schema(description = "店铺分类ID" )
	private Long shopCategoryId;

	@Schema(description = "店铺id" )
	private Long shopId;

	@Schema(description = "spu名称" )
	private String name;

	@Schema(description = "卖点" )
	private String sellingPoint;

	@Schema(description = "商品介绍主图" )
	@JsonSerialize(using = ImgJsonSerializer.class)
	private String mainImgUrl;

	@Schema(description = "商品介绍主图 多个图片逗号分隔" )
	@JsonSerialize(using = ImgJsonSerializer.class)
	private String imgUrls;

	@Schema(description = "售价，整数方式保存" )
	private Long priceFee;

	@Schema(description = "市场价，整数方式保存" )
	private Long marketPriceFee;

	@Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
	private Integer status;

	@Schema(description = "sku是否含有图片 0无 1有" )
	private Integer hasSkuImg;

	@Schema(description = "商品详情" )
	private String detail;

	@Schema(description = "总库存" )
	private Integer totalStock;

	@Schema(description = "规格属性" )
	private List<SpuAttrValueVO> spuAttrValues;

	@Schema(description = "sku列表" )
	private List<SkuVO> skus;

	@Schema(description = "序号" )
	private Integer seq;

	@Schema(description = "品牌信息" )
	private BrandVO brand;

	@Schema(description = "商品销量" )
	private Integer saleNum;

	@Schema(description = "店铺名称" )
	private String shopName;

	@Schema(description = "分类信息" )
	private CategoryVO category;

	@Schema(description = "店铺分类信息" )
	private CategoryVO shopCategory;

	@Schema(description = "分组商品关联id" )
	private Long referenceId;

	@Override
	public String toString() {
		return "SpuVO{" +
				"spuId=" + spuId +
				", brandId=" + brandId +
				", categoryId=" + categoryId +
				", shopCategoryId=" + shopCategoryId +
				", shopId=" + shopId +
				", name='" + name + '\'' +
				", sellingPoint='" + sellingPoint + '\'' +
				", mainImgUrl='" + mainImgUrl + '\'' +
				", imgUrls='" + imgUrls + '\'' +
				", priceFee=" + priceFee +
				", marketPriceFee=" + marketPriceFee +
				", status=" + status +
				", hasSkuImg=" + hasSkuImg +
				", detail='" + detail + '\'' +
				", totalStock=" + totalStock +
				", spuAttrValues=" + spuAttrValues +
				", skus=" + skus +
				", seq=" + seq +
				", brand=" + brand +
				", saleNum=" + saleNum +
				", shopName='" + shopName + '\'' +
				", category=" + category +
				", shopCategory=" + shopCategory +
				", referenceId=" + referenceId +
				'}';
	}
}
