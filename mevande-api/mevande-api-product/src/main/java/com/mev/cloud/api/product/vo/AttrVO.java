package com.mev.cloud.api.product.vo;

import com.mev.cloud.common.vo.BaseVO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 属性信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:23
 */
@Setter
@Getter
public class AttrVO extends BaseVO implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Schema(description = "attr id" )
	private Long attrId;

	@Schema(description = "店铺id" )
	private Long shopId;

	@Schema(description = "属性名称" )
	private String name;

	@Schema(description = "属性描述" )
	private String desc;

	@Schema(description = "作为搜索参数 0:不需要，1:需要" )
	private Integer searchType;

	@Schema(description = "属性类型 0:销售属性，1:基本属性" )
	private Integer attrType;

	@Schema(description = "属性值列表" )
	private List<AttrValueVO> attrValues;

	@Schema(description = "分类列表" )
	private List<CategoryVO> categories;

	@Override
	public String toString() {
		return "AttrVO{" +
				"attrId=" + attrId +
				", shopId=" + shopId +
				", name='" + name + '\'' +
				", desc='" + desc + '\'' +
				", attrType=" + attrType +
				", searchType=" + searchType +
				", attrValues=" + attrValues +
				", categorys=" + categories +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
