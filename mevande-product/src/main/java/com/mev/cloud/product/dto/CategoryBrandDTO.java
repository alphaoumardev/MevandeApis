package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 品牌分类关联信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class CategoryBrandDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    
    private Long id;

    @Schema(description = "品牌id" )
    private Long brandId;

    @Schema(description = "分类id" )
    private Long categoryId;

}
