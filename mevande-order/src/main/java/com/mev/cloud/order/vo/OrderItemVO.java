package com.mev.cloud.order.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单项VO
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class OrderItemVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "订单项ID" )
    private Long orderItemId;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "订单id" )
    private Long orderId;

    @Schema(description = "产品ID" )
    private Long spuId;

    @Schema(description = "产品SkuID" )
    private Long skuId;

    @Schema(description = "用户Id" )
    private Long userId;

    @Schema(description = "购物车产品个数" )
    private Integer count;

    @Schema(description = "产品名称" )
    private String spuName;

    @Schema(description = "sku名称" )
    private String skuName;

    @Schema(description = "产品主图片路径" )
    private String pic;

    @Schema(description = "单个orderItem的配送类型 3：无需快递" )
    private Integer deliveryType;

    @Schema(description = "加入购物车时间" )
    private Date shopCartTime;

    @Schema(description = "产品价格" )
    private Long price;

    @Schema(description = "商品总金额" )
    private Long spuTotalAmount;

	@Schema(description = "发货改变的数量" )
	private Integer changeNum;

	@Override
	public String toString() {
		return "OrderItemVO{" +
				"orderItemId=" + orderItemId +
				", shopId=" + shopId +
				", orderId=" + orderId +
				", spuId=" + spuId +
				", skuId=" + skuId +
				", userId=" + userId +
				", count=" + count +
				", spuName='" + spuName + '\'' +
				", skuName='" + skuName + '\'' +
				", pic='" + pic + '\'' +
				", deliveryType=" + deliveryType +
				", shopCartTime=" + shopCartTime +
				", price=" + price +
				", spuTotalAmount=" + spuTotalAmount +
				", changeNum=" + changeNum +
				'}';
	}
}
