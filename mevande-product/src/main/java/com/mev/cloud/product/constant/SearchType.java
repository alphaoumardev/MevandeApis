package com.mev.cloud.product.constant;

/**
 * 属性的搜素类型
 * @author Alphaoumardev
 * @date 2020/11/20
 */
public enum SearchType {

	/**
	 * 不需要作为搜索参数
	 */
	NOT_SEARCH(0),

	/**
	 * 搜索参数
	 */
	SEARCH(1)
	;

	private final Integer value;

	public Integer value() {
		return value;
	}

	SearchType(Integer value) {
		this.value = value;
	}

}
