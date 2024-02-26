package com.mev.cloud.multishop.model;

import java.io.Serializable;

import com.mev.cloud.common.database.annotations.DistributedId;
import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 商家用户
 *
 * @author Alphaoumardev
 * @date 2020-12-05 15:50:25
 */
@Setter
@Getter
public class ShopUser extends BaseModel implements Serializable{

    /**
     * 商家用户id
     */
	@DistributedId("mevande-multishop-user")
    private Long shopUserId;

    /**
     * 关联店铺id
     */
    private Long shopId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 员工编号
     */
    private String code;

    /**
     * 联系方式
     */
    private String phoneNum;

    /**
     * 是否已经设置账号
     */
    private Integer hasAccount;

	@Override
	public String toString() {
		return "ShopUser{" +
				"shopUserId=" + shopUserId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",shopId=" + shopId +
				",nickName=" + nickName +
				",code=" + code +
				",phoneNum=" + phoneNum +
				",hasAccount=" + hasAccount +
				'}';
	}
}
