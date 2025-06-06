package com.mev.cloud.biz.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 上传文件记录表VO
 *
 * @author Alphaoumardev
 * @date 2020-11-21 10:21:40
 */
@Setter
@Getter
public class AttachFileVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    
    private Long fileId;

    @Schema(description = "文件路径" )
    private String filePath;

    @Schema(description = "文件类型" )
    private String fileType;

    @Schema(description = "文件名" )
    private String fileName;

    @Schema(description = "文件大小" )
    private Integer fileSize;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "文件 1:图片 2:视频 3:文件" )
    private Integer type;

	@Schema(description = "分组id" )
	private Long attachFileGroupId;

	@Override
	public String toString() {
		return "AttachFileVO{" +
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
