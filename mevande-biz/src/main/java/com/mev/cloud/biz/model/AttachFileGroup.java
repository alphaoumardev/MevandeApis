package com.mev.cloud.biz.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 *
 * @author YXF
 * @date 2020-12-04 16:15:02
 */
@Setter
@Getter
public class AttachFileGroup extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long attachFileGroupId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 分组名称
     */
    private String name;

	@Override
	public String toString() {
		return "AttachFileGroup{" +
				"attachFileGroupId=" + attachFileGroupId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",shopId=" + shopId +
				",name=" + name +
				'}';
	}
}
