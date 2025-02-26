package com.mev.cloud.user.model;

import com.mev.cloud.common.model.BaseModel;

import java.io.Serializable;

/**
 * 省市区地区信息
 *
 * @author Alphaoumardev
 * @date 2020-11-25 15:16:14
 */
public class Area extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long areaId;

    /**
     * 地址
     */
    private String areaName;

    /**
     * 上级地址
     */
    private Long parentId;

    /**
     * 等级（从1开始）
     */
    private Integer level;

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Area{" +
				"areaId=" + areaId +
				",areaName=" + areaName +
				",parentId=" + parentId +
				",level=" + level +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				'}';
	}
}
