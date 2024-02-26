package com.mev.cloud.product.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 库存信息
 *
 * @author Alphaoumardev
 * @date 2020-11-11 13:49:06
 */
@Setter
@Getter
@ToString
public class SkuStock extends BaseModel implements Serializable{
	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 库存id
	 */
	private Long stockId;

	/**
	 * SKU ID
	 */
	private Long skuId;

	/**
	 * 实际库存
	 */
	private Integer actualStock;

	/**
	 * 锁定库存
	 */
	private Integer lockStock;

	/**
	 * 可售卖库存
	 */
	private Integer stock;
}
