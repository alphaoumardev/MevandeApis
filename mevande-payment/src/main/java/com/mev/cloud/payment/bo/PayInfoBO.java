package com.mev.cloud.payment.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/25
 */
@Setter
@Getter
public class PayInfoBO
{

    /**
     * 支付信息，如商品名称
     */
    private String body;

    /**
     * 支付单号
     */
    private Long payId;

    /**
     * 付款金额
     */
    private Long payAmount;

    /**
     * api回调域名
     */
    private String apiNoticeUrl;

    /**
     * 支付完成会跳地址
     */
    private String returnUrl;

    /**
     * 第三方用户id
     */
    private String bizUserId;

    @Override
    public String toString() {
        return "PayInfoBO{" +
                "body='" + body + '\'' +
                ", payId='" + payId + '\'' +
                ", payAmount=" + payAmount +
                ", apiNoticeUrl='" + apiNoticeUrl + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                ", bizUserId='" + bizUserId + '\'' +
                '}';
    }
}
