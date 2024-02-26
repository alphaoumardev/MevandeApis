package com.mev.cloud.api.rbac.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/9/2
 */
@Setter
@Getter
public class CheckPermissionDTO
{

	/**
	 * 用户id
	 */
	@NotNull(message = "userId not null")
	private Long userId;

	/**
	 * 系统类型
	 */
	@NotNull(message = "sysType not null")
	private Integer sysType;

	/**
	 * uri
	 */
	@NotBlank(message = "uri not blank")
	private String uri;

	/**
	 * 是否是管理员
	 */
	@NotNull(message = "isAdmin not null")
	private Integer isAdmin;

	/**
	 * 请求方法 1.GET 2.POST 3.PUT 4.DELETE
	 */
	private Integer method;

	@Override
	public String toString() {
		return "CheckPermissionDTO{" + "userId=" + userId + ", sysType=" + sysType + ", uri='" + uri + '\''
				+ ", isAdmin=" + isAdmin + ", method=" + method + '}';
	}

}
