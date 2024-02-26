package com.mev.cloud.api.order.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/30
 */
@Setter
@Getter
public class OrderStatusBO
{

    private Long orderId;

    private Integer status;

    @Override
    public String toString() {
        return "OrderStatusBO{" +
                "orderId=" + orderId +
                ", status=" + status +
                '}';
    }
}
