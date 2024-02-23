package com.mev.cloud.auth.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用于登陆传递账号密码
 *
 * @author Alphaoumardev
 * @date 2020/7/1
 */
@Setter
@Getter
@ToString
public class AuthenticationDTO {

	/**
	 * 用户名
	 */
	@NotBlank(message = "principal不能为空")
	@Schema(description = "用户名" , requiredMode = Schema.RequiredMode.REQUIRED)
	protected String principal;

	/**
	 * 密码
	 */
	@NotBlank(message = "credentials不能为空")
	@Schema(description = "一般用作密码" , requiredMode = Schema.RequiredMode.REQUIRED)
	protected String credentials;

	/**
	 * sysType 参考SysTypeEnum
	 */
	@NotNull(message = "sysType不能为空")
	@Schema(description = "系统类型 0.普通用户系统 1.商家端" , requiredMode = Schema.RequiredMode.REQUIRED)
	protected Integer sysType;


}
