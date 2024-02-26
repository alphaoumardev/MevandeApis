package com.mev.cloud.api.rbac.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/11/27
 */
@Setter
@Getter
public class UserRoleDTO {

    /**
     * 用户id
     */
    @NotNull(message = "userId not null")
    private Long userId;


    /**
     * 角色id列表
     */
    @NotEmpty(message = "userId not null")
    private List<Long> roleIds;

    @Override
    public String toString() {
        return "UserRoleDTO{" +
                "userId=" + userId +
                ", roleIds=" + roleIds +
                '}';
    }
}
