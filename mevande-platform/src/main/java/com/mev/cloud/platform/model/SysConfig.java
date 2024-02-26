package com.mev.cloud.platform.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 系统配置信息表
 *
 * @author lhd
 * @date 2020-12-23 16:27:57
 */
@Setter
@Getter
public class SysConfig extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long id;

    /**
     * key
     */
    private String paramKey;

    /**
     * value
     */
    private String paramValue;

    /**
     * 备注
     */
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
