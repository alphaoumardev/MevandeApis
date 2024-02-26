package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 属性与属性分组关联信息
 *
 * @author YXF
 * @date 2020-11-23 16:20:01
 */
@Setter
@Getter
@ToString
public class AttrCategory extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 属性与分类关联id
     */
    private Long attrCategoryId;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 属性id
     */
    private Long attrId;

}
