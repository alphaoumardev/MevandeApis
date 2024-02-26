package com.mev.cloud.order.dto.multishop;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 订单项VO
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class OrderItemDTO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "订单项ID" )
    private Long orderItemId;

	@Schema(description = "变化金额" , requiredMode = Schema.RequiredMode.REQUIRED)
	private Long changeAmount;

	@Override
	public String toString() {
		return "OrderItemDTO{" +
				"orderItemId=" + orderItemId +
				", changeAmount=" + changeAmount +
				'}';
	}
}
