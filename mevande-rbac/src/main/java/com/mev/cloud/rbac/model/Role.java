package com.mev.cloud.rbac.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 角色
 *
 * @author Alphaoumardev
 * @date 2020-09-17 19:15:44
 */
@Setter
@Getter
@ToString
public class Role extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 业务类型 0平台菜单 1 店铺菜单
     */
    private Integer bizType;

	/**
	 * 所属租户id
	 */
	private Long tenantId;

}
