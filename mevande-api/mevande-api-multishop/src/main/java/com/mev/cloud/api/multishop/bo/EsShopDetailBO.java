package com.mev.cloud.api.multishop.bo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 店铺详情VO
 *
 * @author Alphaoumardev
 * @date 2020-11-23 16:24:29
 */
@Setter
@Getter
public class EsShopDetailBO extends BaseVO implements Serializable
{
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "店铺id" )
    private Long shopId;

    @Schema(description = "店铺类型1自营店 2普通店" )
    private Integer type;

    @Schema(description = "店铺名称" )
    private String shopName;

    @Schema(description = "店铺logo" )
    private String shopLogo;

    @Schema(description = "店铺状态(-1:未开通 0: 停业中 1:营业中)" )
    private Integer shopStatus;

	@Override
	public String toString() {
		return "EsShopDetailBO{" +
				"shopId=" + shopId +
				", type=" + type +
				", shopName='" + shopName + '\'' +
				", shopLogo='" + shopLogo + '\'' +
				", shopStatus=" + shopStatus +
				'}';
	}
}
