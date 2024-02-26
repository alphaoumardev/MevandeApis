package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 品牌分类关联信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class CategoryBrand extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 分类id
     */
    private Long categoryId;
}
