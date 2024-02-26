package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * sku信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SkuDTO implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Schema(description = "属性id" )
	private Long skuId;

	@Schema(description = "SPU id" )
	private Long spuId;

	@Schema(description = "多个销售属性值id逗号分隔" )
	private String attrs;

	@Schema(description = "sku名称" )
	private String skuName;

	@Schema(description = "banner图片" )
	private String imgUrl;

	@Schema(description = "售价，整数方式保存" )
	private Long priceFee;

	@Schema(description = "市场价，整数方式保存" )
	private Long marketPriceFee;

	@Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
	private Integer status;

	@Schema(description = "库存" )
	private Integer stock;

	@Schema(description = "更新时，变化的库存" )
	private Integer changeStock;

	@Schema(description = "商品编码" )
	private String partyCode;

	@Schema(description = "商品条形码" )
	private String modelId;

	@Schema(description = "商品重量" )
	private Double weight;

	@Schema(description = "商品体积" )
	private Double volume;

	@Schema(description = "规格列表" )
	private List<SpuSkuAttrValueDTO> spuSkuAttrValues;

}
