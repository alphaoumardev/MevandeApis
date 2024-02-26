package com.mev.cloud.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @author Alphaoumardev
 */
@Setter
@Getter
public class OrderSearchDTO
{

    /**
     * 用户id
     */
    private Long userId;
    /**
     * 店铺id
     */
    private Long shopId;

    @Schema(description = "订单状态" )
    private Integer status;

    @Schema(description = "是否已经支付，1：已经支付过，0：没有支付过" )
    private Integer isPayed;

    /**
     * 订购流水号
     */
    @Schema(description = "订单号" )
    private Long orderId;

    @Schema(description = "下单的时间范围:开始时间" )
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @Schema(description = "下单的时间范围:结束时间" )
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @Schema(description = "店铺名称" )
    private String shopName;

    @Schema(description = "商品名称" )
    private String spuName;

    @Schema(description = "收货人姓名" )
    private String consignee;

    @Schema(description = "收货人手机号" )
    private String mobile;

    @Schema(description = "物流类型 3：无需快递" )
    private Integer deliveryType;

    @Schema(description = "开始页" )
    private Integer pageNum;

    @Schema(description = "每页大小" )
    private Integer pageSize;

    @Override
    public String toString() {
        return "OrderSearchDTO{" +
                "userId=" + userId +
                ", shopId=" + shopId +
                ", status=" + status +
                ", isPayed=" + isPayed +
                ", orderId=" + orderId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", shopName='" + shopName + '\'' +
                ", spuName='" + spuName + '\'' +
                ", consignee='" + consignee + '\'' +
                ", mobile='" + mobile + '\'' +
                ", deliveryType=" + deliveryType +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
