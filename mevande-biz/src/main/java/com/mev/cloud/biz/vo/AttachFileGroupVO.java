package com.mev.cloud.biz.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * VO
 *
 * @author Alphaoumardev
 * @date 2020-12-04 16:15:02
 */
@Setter
@Getter
public class AttachFileGroupVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    
    private Long attachFileGroupId;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "分组名称" )
    private String name;

	@Override
	public String toString() {
		return "AttachFileGroupVO{" +
				"attachFileGroupId=" + attachFileGroupId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",shopId=" + shopId +
				",name=" + name +
				'}';
	}
}
