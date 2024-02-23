package com.mev.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 更新密码
 *
 * @author Alphaoumardev
 * @date 2020/09/21
 */
@Setter
@Getter
@ToString
public class UpdatePasswordDTO
{

	@NotBlank(message = "oldPassword NotBlank")
	@Schema(description = "旧密码" , requiredMode = Schema.RequiredMode.REQUIRED)
	private String oldPassword;

	@NotNull(message = "newPassword NotNull")
	@Schema(description = "新密码" , requiredMode = Schema.RequiredMode.REQUIRED)
	private String newPassword;
}
