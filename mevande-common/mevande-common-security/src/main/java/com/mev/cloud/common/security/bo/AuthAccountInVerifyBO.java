package com.mev.cloud.common.security.bo;

import com.mev.cloud.api.auth.bo.UserInfoInTokenBO;
import lombok.Getter;
import lombok.Setter;

/**
 * 用于校验的用户信息
 *
 * @author Alphaoumardev
 * @date 2020/7/3
 */
@Setter
@Getter
public class AuthAccountInVerifyBO extends UserInfoInTokenBO {

	private String password;

	private Integer status;

	@Override
	public String toString() {
		return "AuthAccountInVerifyBO{" +
				"password='" + password + '\'' +
				", status=" + status +
				"} " + super.toString();
	}


}
