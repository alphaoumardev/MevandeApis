package com.mev.cloud.multishop.vo;

import com.mev.cloud.common.vo.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 热搜VO
 *
 * @author Alphaoumardev
 * @date 2021-01-27 09:10:00
 */
@Setter
@Getter
public class HotSearchVO extends BaseVO implements Serializable {
    @Serial
	private static final long serialVersionUID = 1L;

    @Schema(description = "主键" )
    private Long hotSearchId;

    @Schema(description = "店铺ID 0为全局热搜" )
    private Long shopId;

    @Schema(description = "内容" )
    private String content;

    @Schema(description = "顺序" )
    private Integer seq;

    @Schema(description = "状态 0下线 1上线" )
    private Integer status;

    @Schema(description = "热搜标题" )
    private String title;

	@Override
	public String toString() {
		return "HotSearchVO{" +
				"hotSearchId=" + hotSearchId +
				",shopId=" + shopId +
				",content=" + content +
				",seq=" + seq +
				",status=" + status +
				",title=" + title +
				'}';
	}
}
