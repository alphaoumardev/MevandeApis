package com.mev.cloud.api.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单快递信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-12-07 15:10:00
 */
@Setter
@Getter
public class DeliveryOrderDTO{

	@Schema(description = "deliveryOrderId" )
	private Long deliveryOrderId;

	@NotNull(message="订单号不能为空")
	@Schema(description = "订单号" ,requiredMode = Schema.RequiredMode.REQUIRED)
	private Long orderId;

	@NotNull(message="发货方式不能为空")
	@Schema(description = "发货方式" ,requiredMode = Schema.RequiredMode.REQUIRED)
	private Integer deliveryType;

	private List<DeliveryOrderItemDTO> selectOrderItems;

	@Override
	public String toString() {
		return "DeliveryOrderDTO{" +
				"deliveryOrderId='" + deliveryOrderId + '\'' +
				"orderNumber='" + orderId + '\'' +
				", deliveryType=" + deliveryType +
				", selectOrderItems=" + selectOrderItems +
				'}';
	}
}
