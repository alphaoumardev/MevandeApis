package com.mev.cloud.rbac.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 菜单资源
 *
 * @author Alphaoumardev
 * @date 2020-09-15 16:36:50
 */
@Setter
@Getter
@ToString
public class MenuPermission extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 菜单资源用户id
     */
    private Long menuPermissionId;

    /**
     * 资源关联菜单
     */
    private Long menuId;

    /**
     * 业务类型 0平台菜单 1 店铺菜单
     */
    private Integer bizType;

    /**
     * 权限对应的编码
     */
    private String permission;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源对应服务器路径
     */
    private String uri;

    /**
     * 请求方法 1.GET 2.POST 3.PUT 4.DELETE
     */
    private Integer method;

}
