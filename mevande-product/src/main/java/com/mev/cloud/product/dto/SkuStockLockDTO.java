package com.mev.cloud.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 库存锁定信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-12-22 16:12:10
 */
@Setter
@Getter
@ToString
public class SkuStockLockDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "id" )
    private Long id;

    @Schema(description = "商品id" )
    private Long spuId;

    @Schema(description = "sku id" )
    private Long skuId;

    @Schema(description = "订单id" )
    private Long orderId;

    @Schema(description = "锁定库存数量" )
    private Integer count;

    @Schema(description = "状态-1已解锁 0待确定 1已锁定" )
    private Integer status;
}
