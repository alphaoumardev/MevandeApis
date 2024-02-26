package com.mev.cloud.product.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品详情信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SpuDetail extends BaseModel implements Serializable{
	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	private Long spuId;

	/**
	 * 商品详情
	 */
	private String detail;

}
