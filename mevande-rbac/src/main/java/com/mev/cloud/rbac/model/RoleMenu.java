package com.mev.cloud.rbac.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 角色与菜单对应关系
 *
 * @author Alphaoumardev
 * @date 2020/6/24
 */
@Setter
@Getter
@ToString
public class RoleMenu extends BaseModel {

	/**
	 * 关联id
	 */
	private Long id;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 菜单ID
	 */
	private Long menuId;

	/**
	 * 菜单资源用户id
	 */
	private Long menuPermissionId;

}
