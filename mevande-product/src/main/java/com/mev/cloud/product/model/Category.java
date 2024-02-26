package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 分类信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class Category extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 父ID
     */
    private Long parentId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类描述
     */
    private String desc;

    /**
     * 分类地址{parent_id}-{child_id},...
     */
    private String path;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

    /**
     * 分类图标
     */
    private String icon;

    /**
     * 分类的显示图片
     */
    private String imgUrl;

    /**
     * 分类层级 从0开始
     */
    private Integer level;

    /**
     * 排序
     */
    private Integer seq;

}
