package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品详情信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SpuDetailDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "商品详情" )
    private String detail;

}
