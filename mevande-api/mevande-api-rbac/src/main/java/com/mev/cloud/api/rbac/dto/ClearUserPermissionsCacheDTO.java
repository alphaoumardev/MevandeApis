package com.mev.cloud.api.rbac.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/11/27
 */
@Setter
@Getter
public class ClearUserPermissionsCacheDTO
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

    @Override
    public String toString() {
        return "ClearUserPermissionsCacheDTO{" +
                "userId=" + userId +
                ", sysType=" + sysType +
                '}';
    }
}
