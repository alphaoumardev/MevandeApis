package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 库存信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SkuStockDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "库存id" )
    private Long stockId;

    @Schema(description = "SKU ID" )
    private Long skuId;

    @Schema(description = "库存" )
    private Integer stock;

}
