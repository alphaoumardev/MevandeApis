package com.mev.cloud.rbac.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 菜单管理VO
 *
 * @author Alphaoumardev
 * @date 2020-09-15 16:35:01
 */
@Setter
@Getter
@ToString
public class MenuVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "菜单id" )
    private Long menuId;

    @Schema(description = "父菜单ID，一级菜单为0" )
    private Long parentId;

    @Schema(description = "权限，需要有哪个权限才能访问该菜单" )
    private String permission;

    @Schema(description = "路径 就像uri" )
    private String path;

    @Schema(description = "组件如：1.'Layout' 为布局，不会跳页面 2.'components-demo/tinymce' 跳转到该页面" )
    private String component;

    @Schema(description = "当设置 noRedirect 的时候该路由在面包屑导航中不可被点击" )
    private String redirect;

    @Schema(description = "一直显示根路由" )
    private Integer alwaysShow;

    @Schema(description = "当设置 true 的时候该路由不会在侧边栏出现 如401，login等页面，或者如一些编辑页面/edit/1" )
    private Integer hidden;

    @Schema(description = "设定路由的名字，一定要填写不然使用<keep-alive>时会出现各种问题" )
    private String name;

    @Schema(description = "设置该路由在侧边栏和面包屑中展示的名字" )
    private String title;

    @Schema(description = "设置该路由的图标，支持 svg-class，也支持 el-icon-x element-ui 的 icon" )
    private String icon;

    @Schema(description = "如果设置为true，则不会被 <keep-alive> 缓存(默认 false)" )
    private Integer noCache;

    @Schema(description = "如果设置为false，则不会在breadcrumb面包屑中显示(默认 true)" )
    private Integer breadcrumb;

    @Schema(description = "若果设置为true，它则会固定在tags-view中(默认 false)" )
    private Integer affix;

    @Schema(description = "当路由设置了该属性，则会高亮相对应的侧边栏。" )
    private String activeMenu;

    @Schema(description = "排序，越小越靠前" )
    private Integer seq;

}
