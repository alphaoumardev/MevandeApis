package com.mev.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 刷新token
 *
 * @author Alphaoumardev
 * @date 2020/7/1
 */
@Setter
@Getter
@ToString
public class RefreshTokenDTO
{

	/**
	 * refreshToken
	 */
	@NotBlank(message = "refreshToken不能为空")
	@Schema(description = "refreshToken" , requiredMode = Schema.RequiredMode.REQUIRED)
	private String refreshToken;

}
