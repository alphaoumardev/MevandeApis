package com.mev.cloud.rbac.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 角色VO
 *
 * @author Alphaoumardev
 * @date 2020-09-17 19:15:44
 */
@Setter
@Getter
@ToString
public class RoleVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "角色id" )
    private Long roleId;

    @Schema(description = "角色名称" )
    private String roleName;

    @Schema(description = "备注" )
    private String remark;

    @Schema(description = "创建者ID" )
    private Long createUserId;

	@Schema(description = "所属租户id" )
	private Long tenantId;

	@Schema(description = "类型" )
	private Integer bizType;

	@Schema(description = "菜单id列表" )
	private List<Long> menuIds;

	@Schema(description = "菜单资源id列表" )
	private List<Long> menuPermissionIds;


}
