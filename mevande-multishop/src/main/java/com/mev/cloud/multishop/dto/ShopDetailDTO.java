package com.mev.cloud.multishop.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 店铺详情DTO
 *
 * @author Alphaoumardev
 * @date 2020-12-05 15:50:25
 */
@Setter
@Getter
public class ShopDetailDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "店铺类型1自营店 2普通店" )
    private Integer type;

    @Schema(description = "店铺名称" )
    private String shopName;

    @Schema(description = "店铺简介" )
    private String intro;

    @Schema(description = "店铺logo(可修改)" )
    private String shopLogo;

    @Schema(description = "店铺状态(-1:已删除 0: 停业中 1:营业中)" )
    private Integer shopStatus;

    @Schema(description = "营业执照" )
    private String businessLicense;

    @Schema(description = "身份证正面" )
    private String identityCardFront;

    @Schema(description = "身份证反面" )
    private String identityCardLater;

    @Size(max = 30)
    @Schema(description = "用户名" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private String username;
    @Size(max = 30)

    @Size(max = 64)
    @Schema(description = "密码" ,requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;

	@Schema(description = "移动端背景图" )
	@NotBlank(message="移动端背景图不能为空")
	private String mobileBackgroundPic;

	@Override
	public String toString() {
		return "ShopDetailDTO{" +
				"shopId=" + shopId +
				", type=" + type +
				", shopName='" + shopName + '\'' +
				", intro='" + intro + '\'' +
				", shopLogo='" + shopLogo + '\'' +
				", shopStatus=" + shopStatus +
				", businessLicense='" + businessLicense + '\'' +
				", identityCardFront='" + identityCardFront + '\'' +
				", identityCardLater='" + identityCardLater + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", mobileBackgroundPic='" + mobileBackgroundPic + '\'' +
				'}';
	}
}
