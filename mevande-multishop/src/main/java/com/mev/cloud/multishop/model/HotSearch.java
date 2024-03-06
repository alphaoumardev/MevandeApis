package com.mev.cloud.multishop.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 热搜
 *
 * @author Alphaoumardev
 * @date 2021-01-27 09:10:00
 */
@Setter
@Getter
public class HotSearch extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long hotSearchId;

    /**
     * 店铺ID 0为全局热搜
     */
    private Long shopId;

    /**
     * 内容
     */
    private String content;

    /**
     * 顺序
     */
    private Integer seq;

    /**
     * 状态 0下线 1上线
     */
    private Integer status;

    /**
     * 热搜标题
     */
    private String title;

	@Override
	public String toString() {
		return "HotSearch{" +
				"hotSearchId=" + hotSearchId +
				", shopId=" + shopId +
				", content='" + content + '\'' +
				", seq=" + seq +
				", status=" + status +
				", title='" + title + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
