package com.mev.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 验证码登陆
 *
 * @author Alphaoumardev
 * @date 2020/7/1
 */

@Setter
@Getter
@ToString
public class CaptchaAuthenticationDTO extends AuthenticationDTO {

	@Schema(description = "验证码" , requiredMode = Schema.RequiredMode.REQUIRED)
	private String captchaVerification;
}
