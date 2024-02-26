package com.mev.cloud.platform.model;

import java.io.Serializable;

import com.mev.cloud.common.database.annotations.DistributedId;
import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 平台用户
 *
 * @author lhd
 * @date 2020-12-21 14:16:34
 */
@Setter
@Getter
public class SysUser extends BaseModel implements Serializable{

    /**
     * 平台用户id
     */
	@DistributedId("mevande-platform-user")
    private Long sysUserId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

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
		return "SysUserVO{" +
				"sysUserId=" + sysUserId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",nickName=" + nickName +
				",avatar=" + avatar +
				",code=" + code +
				",phoneNum=" + phoneNum +
				",hasAccount=" + hasAccount +
				'}';
	}
}
