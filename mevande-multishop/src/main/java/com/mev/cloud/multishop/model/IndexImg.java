package com.mev.cloud.multishop.model;

import java.io.Serial;
import java.io.Serializable;
import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 轮播图
 *
 * @author YXF
 * @date 2020-11-24 16:38:32
 */
@Setter
@Getter
public class IndexImg extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long imgId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 图片
     */
    private String imgUrl;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 顺序
     */
    private Integer seq;

    /**
     * 关联商品id
     */
    private Long spuId;

    /**
     * 图片类型 0:小程序 1:pc
     */
    private Integer imgType;

	@Override
	public String toString() {
		return "IndexImg{" +
				"imgId=" + imgId +
				",shopId=" + shopId +
				",imgUrl=" + imgUrl +
				",status=" + status +
				",seq=" + seq +
				",spuId=" + spuId +
				",imgType=" + imgType +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				'}';
	}
}
