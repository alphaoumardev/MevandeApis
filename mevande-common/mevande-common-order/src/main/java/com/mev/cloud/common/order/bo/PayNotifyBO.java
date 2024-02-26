package com.mev.cloud.common.order.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单支付成功通知
 * @author Alphaoumardev
 * @date 2020/12/8
 */
@Setter
@Getter
public class PayNotifyBO {

    private List<Long> orderIds;

    public PayNotifyBO(){

    }

    public PayNotifyBO(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public String toString() {
        return "PayNotifyBO{" +
                "orderIds=" + orderIds +
                '}';
    }
}
