package com.mev.cloud.product.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * 品牌分类关联信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
public class CategoryBrandVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = 1L;

    
    private Long id;

    @Schema(description = "品牌id" )
    private Long brandId;

    @Schema(description = "分类id" )
    private Long categoryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "CategoryBrandVO{" +
				"id=" + id +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",brandId=" + brandId +
				",categoryId=" + categoryId +
				'}';
	}
}
