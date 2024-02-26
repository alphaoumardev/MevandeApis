package com.mev.cloud.multishop.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 店铺详情
 *
 * @author Alphaoumardev
 * @date 2020-12-05 15:50:25
 */
@Setter
@Getter
public class ShopDetail extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 店铺类型1自营店 2普通店
     */
    private Integer type;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 店铺简介
     */
    private String intro;

    /**
     * 店铺logo(可修改)
     */
    private String shopLogo;

    /**
     * 店铺状态(-1:已删除 0: 停业中 1:营业中)
     */
    private Integer shopStatus;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 身份证正面
     */
    private String identityCardFront;

    /**
     * 身份证反面
     */
    private String identityCardLater;

	/**
	 * 移动端背景图
	 */
	private String mobileBackgroundPic;

	/**
	 * pc背景图
	 */
	private String pcBackgroundPic;

	@Override
	public String toString() {
		return "ShopDetail{" +
				"shopId=" + shopId +
				", type=" + type +
				", shopName='" + shopName + '\'' +
				", intro='" + intro + '\'' +
				", shopLogo='" + shopLogo + '\'' +
				", shopStatus=" + shopStatus +
				", businessLicense='" + businessLicense + '\'' +
				", identityCardFront='" + identityCardFront + '\'' +
				", identityCardLater='" + identityCardLater + '\'' +
				", mobileBackgroundPic='" + mobileBackgroundPic + '\'' +
				", pcBackgroundPic='" + pcBackgroundPic + '\'' +
				'}';
	}
}
