package com.mev.cloud.rbac.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户与角色对应关系
 *
 * @author Alphaoumardev
 * @date 2020/6/24
 */
@Setter
@Getter
@ToString
public class UserRole extends BaseModel {

	/**
	 * 关联id
	 */
	private Long id;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 角色ID
	 */
	private Long roleId;

}
