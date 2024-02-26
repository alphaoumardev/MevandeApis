package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 属性信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:23
 */
@Setter
@Getter
@ToString
public class AttrDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "attr id" )
    private Long attrId;

	@Schema(description = "店铺id" )
	private Long shopId;

	@NotNull(message = "属性名称不能为空")
    @Schema(description = "属性名称" )
    private String name;

	@Schema(description = "属性描述" )
    private String desc;

	@Schema(description = "作为搜索参数 0:不需要，1:需要" )
	private Integer searchType;

	@Schema(description = "属性类型 0:销售属性，1:基本属性" )
	private Integer attrType;

	@Schema(description = "分类id列表" )
	private List<Long> categoryIds;

    @Schema(description = "属性值列表" )
	private List<AttrValueDTO> attrValues;

}
