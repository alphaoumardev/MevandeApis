package com.mev.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 分类信息VO
 *
 * @author Alphaoumardev
 * @date 2020-1-05 15:37:24
 */
@Setter
@Getter
public class CategorySearchVO implements Serializable
{
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "分类id" )
    private Long categoryId;

    @Schema(description = "分类名称" )
    private String name;

	@Override
	public String toString() {
		return "CategorySearchVO{" +
				"categoryId=" + categoryId +
				", name='" + name + '\'' +
				'}';
	}
}
