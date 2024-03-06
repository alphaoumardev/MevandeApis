package com.mev.cloud.multishop.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 轮播图DTO
 *
 * @author Alphaoumardev
 * @date 2020-11-24 16:38:32
 */
@Setter
@Getter
public class IndexImgDTO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "主键" )
    private Long imgId;

    @Schema(description = "店铺ID" )
    private Long shopId;

    @NotNull(message = "图片不能为空")
    @Schema(description = "图片" )
    private String imgUrl;

    @Schema(description = "状态" )
    private Integer status;

    @NotNull(message = "序号不能为空")
    @Schema(description = "顺序" )
    private Integer seq;

    @Schema(description = "关联商品id" )
    private Long spuId;

	@NotNull(message = "图片类型不能为空")
    @Schema(description = "图片类型 0:小程序 1:pc" )
    private Integer imgType;

	@Override
	public String toString() {
		return "IndexImgDTO{" +
				"imgId=" + imgId +
				",shopId=" + shopId +
				",imgUrl=" + imgUrl +
				",status=" + status +
				",seq=" + seq +
				",spuId=" + spuId +
				",imgType=" + imgType +
				'}';
	}
}
