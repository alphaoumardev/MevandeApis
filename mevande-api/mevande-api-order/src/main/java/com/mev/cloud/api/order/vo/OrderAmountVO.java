package com.mev.cloud.api.order.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/25
 */
@Setter
@Getter
public class OrderAmountVO {

    /**
     * 支付金额
     */
    private Long payAmount;

    @Override
    public String toString() {
        return "OrderAmountVO{" +
                "payAmount=" + payAmount +
                '}';
    }
}
