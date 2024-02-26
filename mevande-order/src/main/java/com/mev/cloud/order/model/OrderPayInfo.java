package com.mev.cloud.order.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 订单支付记录
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class OrderPayInfo extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 支付单号
     */
    private Long payId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 外部订单流水号
     */
    private String bizPayNo;

    /**
     * 系统类型 见SysTypeEnum
     */
    private Integer sysType;

    /**
     * 支付状态
     */
    private Integer payStatus;

    /**
     * 支付金额
     */
    private Long payAmount;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 回调内容
     */
    private String callbackContent;

    /**
     * 回调时间
     */
    private Date callbackTime;

    /**
     * 确认时间
     */
    private Date confirmTime;

	@Override
	public String toString() {
		return "OrderPayInfo{" +
				"payId=" + payId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",userId=" + userId +
				",bizPayNo=" + bizPayNo +
				",sysType=" + sysType +
				",payStatus=" + payStatus +
				",payAmount=" + payAmount +
				",version=" + version +
				",callbackContent=" + callbackContent +
				",callbackTime=" + callbackTime +
				",confirmTime=" + confirmTime +
				'}';
	}
}
