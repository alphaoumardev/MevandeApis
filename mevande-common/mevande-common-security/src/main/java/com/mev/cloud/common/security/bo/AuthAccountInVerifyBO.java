package com.mev.cloud.common.security.bo;

import com.mev.cloud.api.auth.bo.UserInfoInTokenBO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用于校验的用户信息
 *
 * @author Alphaoumardev
 * @date 2020/7/3
 */
@Setter
@Getter
@ToString
public class AuthAccountInVerifyBO extends UserInfoInTokenBO
{

	private String password;

	private Integer status;
}
