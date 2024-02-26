package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * spu信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SpuDTO implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Schema(description = "spuId" )
	private Long spuId;

	@Schema(description = "品牌ID" )
	private Long brandId;

	@NotNull(message = "分类不能为空")
	@Schema(description = "分类ID" )
	private Long categoryId;

	@NotNull(message = "店铺分类不能为空")
	@Schema(description = "店铺分类ID" )
	private Long shopCategoryId;

	@NotNull(message = "商品名称不能为空")
	@Schema(description = "spu名称" )
	private String name;

	@Schema(description = "卖点" )
	private String sellingPoint;

	@NotNull(message = "商品轮播图不能为空")
	@Schema(description = "商品介绍主图 多个图片逗号分隔" )
	private String imgUrls;

	@NotNull(message = "商品主图不能为空")
	@Schema(description = "商品主图" )
	private String mainImgUrl;

	@Schema(description = "市场价" )
	private Long marketPriceFee;

	@NotNull(message = "售价不能为空")
	@Schema(description = "售价" )
	private Long priceFee;

	@Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
	private Integer status;

	@Schema(description = "商品属性值列表" )
	private List<SpuAttrValueDTO> spuAttrValues;

	@NotEmpty(message = "sku信息不能为空")
	@Schema(description = "商品规格列表" )
	private List<SkuDTO> skuList;

	@Schema(description = "商品详情" )
	private String detail;

	@NotNull(message = "总库存不能为空")
	@Schema(description = "总库存" )
	private Integer totalStock;

	@Schema(description = "更新时，变化的库存" )
	private Integer changeStock;

	@Schema(description = "商品视频" )
	private String video;

	@Schema(description = "sku是否含有图片 0无 1有" )
	private Integer hasSkuImg;

	@Schema(description = "分组id" )
	private Long tagId;

	@Schema(description = "序号" )
	private Integer seq;

	@Schema(description = "spuId列表(商品上下架：批量操作时，用此参数)(批量处理参数)" )
	private List<Long> spuIds;

	@Schema(description = "店铺id" )
	private Long shopId;

}
