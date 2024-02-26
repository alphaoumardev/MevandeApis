package com.mev.cloud.order.dto.multishop;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * 订单参数
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class OrderAdminDTO
{
    @Schema(description = "订单id" )
    private Long orderId;

    @Schema(description = "店铺id" )
    private Long shopId;

    @NotNull(message = "配送类型不能为空")
    @Schema(description = "配送类型 3：无需快递" )
    private Integer dvyType;

    @Override
    public String toString() {
        return "OrderDTO{" +
                ", orderId=" + orderId +
                ", shopId=" + shopId +
                ", dvyType=" + dvyType +
                '}';
    }
}
