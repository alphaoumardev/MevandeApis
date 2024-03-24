package com.mev.cloud.platform.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lhd
 * @date 2020/9/2
 */
@Setter
@Getter
public class SysUserVO
{
	/**
	 * sysUserId
	 */
	@Schema(description = "平台用户id" )
	private Long sysUserId;

	/**
	 * 昵称
	 */
	@Schema(description = "昵称" )
	private String nickName;

	/**
	 * 头像
	 */
	@Schema(description = "头像" )
	@JsonSerialize(using = ImgJsonSerializer.class)
	private String avatar;

	/**
	 * 员工编号
	 */
	@Schema(description = "员工编号" )
	private String code;

	/**
	 * 联系方式
	 */
	@Schema(description = "联系方式" )
	private String phoneNum;

	@Schema(description = "是否已经有账号了" )
	private Integer hasAccount;

	@Schema(description = "平台id" )
	private Long shopId;

	@Schema(description = "角色id列表" )
	private List<Long> roleIds;

	@Override
	public String toString() {
		return "SysUserVO{" +
				"sysUserId=" + sysUserId +
				", nickName='" + nickName + '\'' +
				", avatar='" + avatar + '\'' +
				", code='" + code + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", hasAccount=" + hasAccount +
				", shopId=" + shopId +
				", roleIds=" + roleIds +
				'}';
	}
}
