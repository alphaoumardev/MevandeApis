package com.mev.cloud.api.product.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品sku销售属性关联信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
public class SpuSkuAttrValueVO extends BaseVO implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Schema(description = "商品sku销售属性关联信息id" )
	private Integer spuSkuAttrId;

	@Schema(description = "SPU ID" )
	private Long spuId;

	@Schema(description = "SKU ID" )
	private Long skuId;

	@Schema(description = "销售属性ID" )
	private Integer attrId;

	@Schema(description = "销售属性名称" )
	private String attrName;

	@Schema(description = "销售属性值ID" )
	private Integer attrValueId;

	@Schema(description = "销售属性值" )
	private String attrValueName;

	@Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
	private Integer status;

	@Override
	public String toString() {
		return "SpuSkuAttrValueVO{" +
				"spuSkuAttrId=" + spuSkuAttrId +
				", spuId=" + spuId +
				", skuId=" + skuId +
				", attrId=" + attrId +
				", attrName='" + attrName + '\'' +
				", attrValueId=" + attrValueId +
				", attrValueName='" + attrValueName + '\'' +
				", status=" + status +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
