package com.mev.cloud.common.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 购物车VO
 *
 * @author Alphaoumardev
 * @date 2020-11-20 15:47:32
 */
@Setter
@Getter
public class ShopCartVO {

	@Schema(description = "店铺ID" , requiredMode = Schema.RequiredMode.REQUIRED)
	private Long shopId;

	@Schema(description = "店铺名称" , requiredMode = Schema.RequiredMode.REQUIRED)
	private String shopName;

	@Schema(description = "店铺类型1自营店 2普通店" )
	private Integer shopType;

	@Schema(description = "购物车商品信息" )
	private List<ShopCartItemVO> shopCartItem;

	@Schema(description = "商品总值" , requiredMode = Schema.RequiredMode.REQUIRED)
	private Long total;
	@Schema(description = "数量" , requiredMode = Schema.RequiredMode.REQUIRED)
	private Integer totalCount;

	@Override
	public String toString() {
		return "ShopCartVO{" +
				"shopId=" + shopId +
				", shopName='" + shopName + '\'' +
				", shopType=" + shopType +
				", shopCartItem=" + shopCartItem +
				", total=" + total +
				", totalCount=" + totalCount +
				'}';
	}

}
