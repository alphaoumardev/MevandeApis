package com.mev.cloud.api.order.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/30
 */
@Setter
@Getter
public class OrderSimpleAmountInfoBO
{

    private Long orderId;

    private Long shopId;

    /**
     * 实际总值
     */
    private Long actualTotal;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单关闭原因
     */
    private Integer closeType;

    @Override
    public String toString() {
        return "OrderSimpleAmountInfoBO{" +
                "orderId=" + orderId +
                ", shopId=" + shopId +
                ", actualTotal=" + actualTotal +
                ", status=" + status +
                ", closeType=" + closeType +
                '}';
    }
}
