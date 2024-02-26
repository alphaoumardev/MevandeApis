package com.mev.cloud.api.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * 购物车物品参数
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class ShopCartItemDTO {

	@NotNull(message = "产品ID不能为空")
	@Schema(description = "产品ID" ,requiredMode = Schema.RequiredMode.REQUIRED)
	private Long spuId;

	@NotNull(message = "skuId不能为空")
	@Schema(description = "skuId" ,requiredMode = Schema.RequiredMode.REQUIRED)
	private Long skuId;

	@NotNull(message = "商品数量不能为空")
	@Min(value = 1,message = "商品数量不能为空")
	@Schema(description = "商品数量" ,requiredMode = Schema.RequiredMode.REQUIRED)
	private Integer count;

	@NotNull(message = "店铺id不能为空")
	@Schema(description = "店铺id" ,requiredMode = Schema.RequiredMode.REQUIRED)
	private Long shopId;

	@Override
	public String toString() {
		return "OrderItemDTO{" +
				"spuId=" + spuId +
				", skuId=" + skuId +
				", count=" + count +
				", shopId=" + shopId +
				'}';
	}
}
