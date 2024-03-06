package com.mev.cloud.multishop.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.api.product.vo.SpuVO;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 轮播图VO
 *
 * @author Alphaoumardev
 * @date 2020-11-24 16:38:32
 */
@Setter
@Getter
public class IndexImgVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "主键" )
    private Long imgId;

    @Schema(description = "店铺ID" )
    private Long shopId;

    @Schema(description = "图片" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String imgUrl;

    @Schema(description = "状态" )
    private Integer status;

    @Schema(description = "顺序" )
    private Integer seq;

    @Schema(description = "关联商品id" )
    private Long spuId;

    @Schema(description = "图片类型 0:小程序 1:pc" )
    private Integer imgType;

    @Schema(description = "spu信息" )
	private SpuVO spu;

	@Override
	public String toString() {
		return "IndexImgVO{" +
				"imgId=" + imgId +
				",shopId=" + shopId +
				",imgUrl=" + imgUrl +
				",status=" + status +
				",seq=" + seq +
				",spuId=" + spuId +
				",imgType=" + imgType +
				",spu=" + spu +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				'}';
	}
}
