package com.mev.cloud.rbac.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 菜单管理DTO
 *
 * @author Alphaoumardev
 * @date 2020-09-15 16:35:01
 */
@Setter
@Getter
@ToString
public class MenuDTO {
    private static final long serialVersionUID = 1L;

    @Schema(description = "菜单id" )
    private Long menuId;

    @NotNull(message = "parentId NotNull")
    @Schema(description = "父菜单ID，一级菜单为0" )
    private Long parentId;

    @Schema(description = "权限，需要有哪个权限才能访问该菜单" )
    private String permission;

    @Schema(description = "路径 就像uri" )
    private String path;

	@NotBlank(message = "component NotBlank")
    @Schema(description = "组件如：1.'Layout' 为布局，不会跳页面 2.'components-demo/tinymce' 跳转到该页面" )
    private String component;

    @Schema(description = "当设置 true 的时候该路由不会在侧边栏出现 如401，login等页面，或者如一些编辑页面/edit/1" )
    private Integer hidden;

	@NotBlank(message = "name NotBlank")
    @Schema(description = "设定路由的名字，一定要填写不然使用<keep-alive>时会出现各种问题" )
    private String name;

	@NotBlank(message = "title NotBlank")
    @Schema(description = "设置该路由在侧边栏和面包屑中展示的名字" )
    private String title;

	@Schema(description = "系统类型" )
	private Integer sysType;

    @Schema(description = "设置该路由的图标，支持 svg-class，也支持 el-icon-x element-ui 的 icon" )
    private String icon;

    @Schema(description = "当路由设置了该属性，则会高亮相对应的侧边栏。" )
    private String activeMenu;

    @Schema(description = "排序，越小越靠前" )
    private Integer seq;

}
