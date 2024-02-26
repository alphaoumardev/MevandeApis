package com.mev.cloud.rbac.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 菜单id和权限id列表
 * @author Alphaoumardev
 * @date 2020/9/18
 */
@Setter
@Getter
@ToString
public class MenuWithPermissionIdDTO {

    @Schema(description = "菜单id" )
    private Long menuId;

    @Schema(description = "菜单下的权限id列表" )
    private List<Long> permissionIds;
}
