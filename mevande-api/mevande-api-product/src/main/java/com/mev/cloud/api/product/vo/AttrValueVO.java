package com.mev.cloud.api.product.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 属性值信息VO
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
public class AttrValueVO extends BaseVO implements Serializable
{
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "属性id" )
    private Long attrValueId;

    @Schema(description = "属性ID" )
    private Long attrId;

    @Schema(description = "属性值" )
    private String value;

	@Override
	public String toString() {
		return "AttrValueVO{" +
				"attrValueId=" + attrValueId +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",attrId=" + attrId +
				",value=" + value +
				'}';
	}
}
