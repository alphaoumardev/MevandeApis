package com.mev.cloud.api.auth.bo;

import com.mev.cloud.api.auth.constant.SysTypeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 保存在token信息里面的用户信息
 * @author Alphaoumardev
 * @date 2020/7/3
 */
@Setter
@Getter
@ToString
public class UserInfoInTokenBO
{
	/**
	 * 用户在自己系统的用户id
	 */
	private Long userId;

	/**
	 * 全局唯一的id,
	 */
	private Long uid;

	/**
	 * 租户id (商家id)
	 */
	private Long tenantId;

	/**
	 * 系统类型
	 * @see SysTypeEnum
	 */
	private Integer sysType;

	/**
	 * 是否是管理员
	 */
	private Integer isAdmin;

	private String bizUserId;

	private String bizUid;

}
