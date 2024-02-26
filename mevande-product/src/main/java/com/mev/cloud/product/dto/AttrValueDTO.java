package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 属性值信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class AttrValueDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "属性id" )
    private Long attrValueId;

    @Schema(description = "属性ID" )
    private Long attrId;

    @Schema(description = "属性值" )
    private String value;
}
