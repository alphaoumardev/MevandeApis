package com.mev.cloud.api.auth.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * token信息，该信息用户返回给前端，前端请求携带accessToken进行用户校验
 *
 * @author Alphaoumardev
 * @date 2020/7/2
 */
@Setter
@Getter
public class TokenInfoVO {

	@Schema(description = "accessToken" )
	private String accessToken;

	@Schema(description = "refreshToken" )
	private String refreshToken;

	@Schema(description = "在多少秒后过期" )
	private Integer expiresIn;

	@Override
	public String toString() {
		return "TokenInfoVO{" + "accessToken='" + accessToken + '\'' + ", refreshToken='" + refreshToken + '\''
				+ ", expiresIn=" + expiresIn + '}';
	}

}
