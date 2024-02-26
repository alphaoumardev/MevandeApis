package com.mev.cloud.api.product.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * sku信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
public class SkuVO extends BaseVO implements Serializable {
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

	@Schema(description = "商品编码" )
	private String partyCode;

	@Schema(description = "商品条形码" )
	private String modelId;

	@Schema(description = "商品重量" )
	private BigDecimal weight;

	@Schema(description = "商品体积" )
	private BigDecimal volume;

	@Schema(description = "当前sku规格列表" )
	private List<SpuSkuAttrValueVO> spuSkuAttrValues;

	@Override
	public String toString() {
		return "SkuVO{" +
				"skuId=" + skuId +
				", spuId=" + spuId +
				", attrs='" + attrs + '\'' +
				", imgUrl='" + imgUrl + '\'' +
				", priceFee=" + priceFee +
				", marketPriceFee=" + marketPriceFee +
				", status=" + status +
				", stock=" + stock +
				", spuSkuAttrValues=" + spuSkuAttrValues +
				", partyCode='" + partyCode + '\'' +
				", modelId='" + modelId + '\'' +
				", weight=" + weight +
				", volume=" + volume +
				'}';
	}
}
