package com.mev.cloud.api.product.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 品牌信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
public class BrandVO extends BaseVO implements Serializable
{
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "brand_id" )
    private Long brandId;

    @Schema(description = "品牌名称" )
    private String name;

    @Schema(description = "品牌描述" )
    private String desc;

    @Schema(description = "品牌logo图片" )
	@JsonSerialize(using = ImgJsonSerializer.class)
    private String imgUrl;

    @Schema(description = "检索首字母" )
    private String firstLetter;

    @Schema(description = "排序" )
    private Integer seq;

    @Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
    private Integer status;

	@Schema(description = "分类" )
	private List<CategoryVO> categories;

	@Override
	public String toString() {
		return "BrandVO{" +
				"brandId=" + brandId +
				", name='" + name + '\'' +
				", desc='" + desc + '\'' +
				", imgUrl='" + imgUrl + '\'' +
				", firstLetter='" + firstLetter + '\'' +
				", seq=" + seq +
				", status=" + status +
				", categories=" + categories +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
