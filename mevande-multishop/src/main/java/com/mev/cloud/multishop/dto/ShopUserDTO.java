package com.mev.cloud.multishop.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/9/8
 */
@Setter
@Getter
public class ShopUserDTO {

    @Schema(description = "店铺用户id" )
    private Long shopUserId;

    @NotBlank(message = "昵称不能为空")
    @Schema(description = "昵称" )
    private String nickName;

    @Schema(description = "员工编号" )
    private String code;

    @Schema(description = "联系方式" )
    private String phoneNum;

    @Schema(description = "角色id列表" )
    private List<Long> roleIds;

    @Override
    public String toString() {
        return "ShopUserDTO{" +
                "shopUserId=" + shopUserId +
                ", nickName='" + nickName + '\'' +
                ", code='" + code + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", roleIds=" + roleIds +
                '}';
    }
}
