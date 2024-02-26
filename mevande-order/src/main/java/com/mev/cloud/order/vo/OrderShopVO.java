package com.mev.cloud.order.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单下的每个店铺
 *
 * @author Alphaoumardev
 */
@Setter
@Getter
public class OrderShopVO implements Serializable
{

    @Schema(description = "店铺id" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long shopId;

    @Schema(description = "店铺名称" , requiredMode = Schema.RequiredMode.REQUIRED)
    private String shopName;

    @Schema(description = "商品总值" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Long total;

    @Schema(description = "商品总数" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer totalNum;


    @Schema(description = "地址Dto" , requiredMode = Schema.RequiredMode.REQUIRED)
    private OrderAddrVO orderAddr;

    @Schema(description = "产品信息" , requiredMode = Schema.RequiredMode.REQUIRED)
    private List<OrderItemVO> orderItems;

    @Schema(description = "订单创建时间" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Date createTime;

    @Schema(description = "订单付款时间")
    private Date payTime;

    @Schema(description = "订单发货时间")
    private Date deliveryTime;

    @Schema(description = "订单完成时间")
    private Date finallyTime;

    @Schema(description = "订单取消时间")
    private Date cancelTime;

    @Schema(description = "订单更新时间")
    private Date updateTime;

    @Schema(description = "配送类型 3：无需快递" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer deliveryType;

    @Schema(description = "订单状态" , requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer status;

    @Override
    public String toString() {
        return "OrderShopVO{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", total=" + total +
                ", totalNum=" + totalNum +
                ", orderAddr=" + orderAddr +
                ", orderItems=" + orderItems +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", deliveryTime=" + deliveryTime +
                ", finallyTime=" + finallyTime +
                ", cancelTime=" + cancelTime +
                ", updateTime=" + updateTime +
                ", deliveryType=" + deliveryType +
                ", status=" + status +
                '}';
    }
}
