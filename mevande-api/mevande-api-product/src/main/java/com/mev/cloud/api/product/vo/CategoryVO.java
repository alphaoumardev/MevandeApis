package com.mev.cloud.api.product.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mev.cloud.common.serializer.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 分类信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
public class CategoryVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "分类id" )
    private Long categoryId;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "父ID" )
    private Long parentId;

    @Schema(description = "分类名称" )
    private String name;

    @Schema(description = "分类描述" )
    private String desc;

    @Schema(description = "分类地址{parent_id}-{child_id},..." )
    private String path;

    @Schema(description = "状态 1:enable, 0:disable, -1:deleted" )
    private Integer status;

	@JsonSerialize(using = ImgJsonSerializer.class)
    @Schema(description = "分类图标" )
    private String icon;

	@JsonSerialize(using = ImgJsonSerializer.class)
    @Schema(description = "分类的显示图片" )
    private String imgUrl;

    @Schema(description = "分类层级 从0开始" )
    private Integer level;

	@Schema(description = "排序" )
	private Integer seq;

	@Schema(description = "上级分类名称" )
	private List<String> pathNames;

	@Schema(description = "子分类列表" )
	private List<CategoryVO> categories;

	@Override
	public String toString() {
		return "CategoryVO{" +
				"categoryId=" + categoryId +
				", shopId=" + shopId +
				", parentId=" + parentId +
				", name='" + name + '\'' +
				", desc='" + desc + '\'' +
				", path='" + path + '\'' +
				", status=" + status +
				", icon='" + icon + '\'' +
				", imgUrl='" + imgUrl + '\'' +
				", level=" + level +
				", seq=" + seq +
				", pathNames=" + pathNames +
				", categories=" + categories +
				'}';
	}
}
