package com.mev.cloud.platform.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lhd
 * @date 2020/12/22
 */
@Setter
@Getter
public class ChangeAccountDTO {

    @NotNull(message = "userId not null")
    @Schema(description = "用户id" )
    private Long userId;

    @NotBlank(message = "username not blank")
    @Schema(description = "用户名" )
    private String username;

    @NotBlank(message = "password not blank")
    @Schema(description = "密码" )
    private String password;

    @NotNull(message = "status not null")
    @Schema(description = "状态 1启用 0禁用" )
    private Integer status;

    @Override
    public String toString() {
        return "ChangeAccountDTO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
