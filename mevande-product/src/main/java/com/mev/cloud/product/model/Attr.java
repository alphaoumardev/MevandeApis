package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 属性信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:23
 */
@Setter
@Getter
@ToString
public class Attr extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;


	/**
     * attr id
     */
    private Long attrId;

	/**
	 * 店铺id
	 */
	private Long shopId;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性描述
     */
    private String desc;

	/**
	 * 作为搜索参数 0:不需要，1:需要
	 */
	private Integer searchType;

	/**
	 * 属性类型 0:销售属性，1:基本属性
	 */
	private Integer attrType;

	/**
	 * 属性值列表
	 */
	private List<AttrValue> attrValues;

}
