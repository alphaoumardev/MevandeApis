package com.mev.cloud.order.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单支付记录VO
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class OrderPayInfoVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "支付单号" )
    private Long payId;

    @Schema(description = "用户id" )
    private Long userId;

    @Schema(description = "外部订单流水号" )
    private String bizPayNo;

    @Schema(description = "系统类型 见SysTypeEnum" )
    private Integer sysType;

    @Schema(description = "支付状态" )
    private Integer payStatus;

    @Schema(description = "支付金额" )
    private Long payAmount;

    @Schema(description = "版本号" )
    private Integer version;

    @Schema(description = "回调内容" )
    private String callbackContent;

    @Schema(description = "回调时间" )
    private Date callbackTime;

    @Schema(description = "确认时间" )
    private Date confirmTime;

	@Override
	public String toString() {
		return "OrderPayInfoVO{" +
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
