package com.mev.cloud.order.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Alphaoumardev
 * @date 2021/2/4
 */
@Setter
@Getter
public class SubmitOrderPayAmountInfoBO
{
    @Schema(description = "创建时间" )
    private Date createTime;

    @Schema(description = "总共需要支付金额" )
    private Long totalFee;

    @Schema(description = "订单地址id" )
    private Long orderAddrId;

    @Override
    public String toString() {
        return "SubmitOrderPayAmountInfoBO{" +
                "createTime=" + createTime +
                ", totalFee=" + totalFee +
                ", orderAddrId=" + orderAddrId +
                '}';
    }
}
