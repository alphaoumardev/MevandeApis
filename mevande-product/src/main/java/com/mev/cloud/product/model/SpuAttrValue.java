package com.mev.cloud.product.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品规格属性关联信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SpuAttrValue extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 商品属性值关联信息id
     */
    private Long spuAttrValueId;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 规格属性id
     */
    private Long attrId;

    /**
     * 规格属性名称
     */
    private String attrName;

    /**
     * 规格属性值id
     */
    private Long attrValueId;

	/**
	 * 规格属性值名称
	 */
	private String attrValueName;

	/**
	 * 规格属性描述
	 */
	private String attrDesc;

}
