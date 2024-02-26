package com.mev.cloud.biz.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 上传文件记录表
 *
 * @author Alphaoumardev
 * @date 2020-11-21 10:21:40
 */
@Setter
@Getter
public class AttachFile extends BaseModel implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long fileId;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件大小
     */
    private Integer fileSize;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 文件 1:图片 2:视频 3:文件
     */
    private Integer type;

	/**
	 * 文件分组id（0：默认为所有）
	 */
	private Long attachFileGroupId;

	@Override
	public String toString() {
		return "AttachFile{" +
				"fileId=" + fileId +
				", filePath='" + filePath + '\'' +
				", fileType='" + fileType + '\'' +
				", fileName='" + fileName + '\'' +
				", fileSize=" + fileSize +
				", shopId=" + shopId +
				", type=" + type +
				", attachFileGroupId=" + attachFileGroupId +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
