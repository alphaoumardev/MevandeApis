package com.mev.cloud.api.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 物流订单项信息DTO
 *
 * @author Alphaoumardev
 * @date 2020-12-07 15:10:00
 */
@Setter
@Getter
public class DeliveryOrderItemDTO
{

    @Schema(description = "id" )
    private Long orderItemId;

    @Schema(description = "商品图片" )
    private String pic;

    @Schema(description = "商品名称" )
    private String spuName;

    @Schema(description = "发货改变的数量" )
    private Integer changeNum;

	@Override
	public String toString() {
		return "DeliveryOrderItemDTO{" +
				"orderItemId=" + orderItemId +
				", pic='" + pic + '\'' +
				", spuName='" + spuName + '\'' +
				", changeNum=" + changeNum +
				'}';
	}
}
