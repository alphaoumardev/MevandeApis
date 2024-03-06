package com.mev.cloud.product.constant;

/**
 * 属性类型
 * @author Alphaoumardev
 * @date 2020/11/20
 */
public enum AttrType {

	/**
	 * 销售属性
	 */
	SALES(0),

	/**
	 * 基本属性
	 */
	BASIC(1)
	;

	private final Integer value;

	public Integer value() {
		return value;
	}

	AttrType(Integer value) {
		this.value = value;
	}

}
