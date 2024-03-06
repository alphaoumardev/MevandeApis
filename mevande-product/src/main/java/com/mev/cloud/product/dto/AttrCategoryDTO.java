package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 属性与属性分组关联信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-11-23 16:20:01
 */
@Setter
@Getter
@ToString
public class AttrCategoryDTO implements Serializable
{
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "属性与分类关联id" )
    private Long attrCategoryId;

    @Schema(description = "分类id" )
    private Long categoryId;

    @Schema(description = "属性id" )
    private Long attrId;

}
