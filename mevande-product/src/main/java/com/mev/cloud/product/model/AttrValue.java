package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 属性值信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class AttrValue extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Long attrValueId;

    /**
     * 属性ID
     */
    private Long attrId;

    /**
     * 属性值
     */
    private String value;


}
