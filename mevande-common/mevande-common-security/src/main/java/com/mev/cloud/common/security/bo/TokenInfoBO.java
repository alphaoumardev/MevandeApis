package com.mev.cloud.common.security.bo;

import com.mev.cloud.api.auth.bo.UserInfoInTokenBO;
import lombok.Getter;
import lombok.Setter;

/**
 * token信息，该信息存在redis中
 *
 * @author Alphaoumardev
 * @date 2020/7/2
 */
@Setter
@Getter
public class TokenInfoBO {

	/**
	 * 保存在token信息里面的用户信息
	 */
	private UserInfoInTokenBO userInfoInToken;

	private String accessToken;

	private String refreshToken;

	/**
	 * 在多少秒后过期
	 */
	private Integer expiresIn;

	@Override
	public String toString() {
		return "TokenInfoBO{" + "userInfoInToken=" + userInfoInToken + ", accessToken='" + accessToken + '\''
				+ ", refreshToken='" + refreshToken + '\'' + ", expiresIn=" + expiresIn + '}';
	}

}
