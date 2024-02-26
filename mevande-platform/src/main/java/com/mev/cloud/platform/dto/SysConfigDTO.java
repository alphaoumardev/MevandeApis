package com.mev.cloud.platform.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 系统配置信息表DTO
 *
 * @author lhd
 * @date 2020-12-23 16:27:57
 */
@Setter
@Getter
public class SysConfigDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    
    private Long id;

    @Schema(description = "key" )
    private String paramKey;

    @Schema(description = "value" )
    private String paramValue;

    @Schema(description = "备注" )
    private String remark;

	@Override
	public String toString() {
		return "SysConfigVO{" +
				"id=" + id +
				",paramKey=" + paramKey +
				",paramValue=" + paramValue +
				",remark=" + remark +
				'}';
	}
}
