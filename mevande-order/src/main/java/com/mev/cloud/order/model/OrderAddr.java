package com.mev.cloud.order.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户订单配送地址
 *
 * @author Alphaoumardev
 * @date 2020-12-05 14:13:50
 */
@Setter
@Getter
public class OrderAddr extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long orderAddrId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 省ID
     */
    private Long provinceId;

    /**
     * 省
     */
    private String province;

    /**
     * 城市ID
     */
    private Long cityId;

    /**
     * 城市
     */
    private String city;

    /**
     * 区域ID
     */
    private Long areaId;

    /**
     * 区
     */
    private String area;

    /**
     * 地址
     */
    private String addr;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 手机
     */
    private String mobile;

	@Override
	public String toString() {
		return "OrderAddr{" +
				"orderAddrId=" + orderAddrId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",userId=" + userId +
				",consignee=" + consignee +
				",provinceId=" + provinceId +
				",province=" + province +
				",cityId=" + cityId +
				",city=" + city +
				",areaId=" + areaId +
				",area=" + area +
				",addr=" + addr +
				",postCode=" + postCode +
				",mobile=" + mobile +
				'}';
	}
}
