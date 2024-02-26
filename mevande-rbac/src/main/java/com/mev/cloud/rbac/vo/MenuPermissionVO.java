package com.mev.cloud.rbac.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 菜单资源VO
 *
 * @author Alphaoumardev
 * @date 2020-09-15 16:35:01
 */
@Setter
@Getter
@ToString
public class MenuPermissionVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "菜单资源用户id" )
    private Long menuPermissionId;

    @Schema(description = "资源关联菜单" )
    private Long menuId;

	@Schema(description = "菜单标题" )
	private String menuTitle;

    @Schema(description = "权限对应的编码" )
    private String permission;

    @Schema(description = "资源名称" )
    private String name;

    @Schema(description = "资源对应服务器路径" )
    private String uri;

    @Schema(description = "请求方法 1.GET 2.POST 3.PUT 4.DELETE" )
    private Integer method;

}
