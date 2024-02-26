package com.mev.cloud.multishop.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/9/2
 */
@Setter
@Getter
public class ShopUserSimpleVO {

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

	private Integer isAdmin;

	@Override
	public String toString() {
		return "ShopUserSimpleVO{" +
				"nickName='" + nickName + '\'' +
				", avatar='" + avatar + '\'' +
				", isAdmin=" + isAdmin +
				'}';
	}

}
