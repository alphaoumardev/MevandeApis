package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 购物车
 *
 * @author Alphaoumardev
 * @date 2020-11-21 10:01:23
 */
@Setter
@Getter
@ToString
public class ShopCartItem extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long cartItemId;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 产品ID
     */
    private Long spuId;

    /**
     * SkuID
     */
    private Long skuId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 购物车产品个数
     */
    private Integer count;

    /**
     * 售价，加入购物车时的商品价格
     */
    private Long priceFee;

	/**
	 * 是否已经勾选
	 */
	private Integer isChecked;

}
