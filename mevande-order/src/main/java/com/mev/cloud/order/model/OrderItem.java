package com.mev.cloud.order.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 订单项
 *
 * @author Alphaoumardev
 * @date 2020-12-04 11:27:35
 */
@Setter
@Getter
public class OrderItem extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 订单项ID
     */
    private Long orderItemId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 产品ID
     */
    private Long spuId;

    /**
     * 产品SkuID
     */
    private Long skuId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 购物车产品个数
     */
    private Integer count;

    /**
     * 产品名称
     */
    private String spuName;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 产品主图片路径
     */
    private String pic;

    /**
     * 单个orderItem的配送类型 3：无需快递
     */
    private Integer deliveryType;

    /**
     * 加入购物车时间
     */
    private Date shopCartTime;

    /**
     * 产品价格
     */
    private Long price;

    /**
     * 商品总金额
     */
    private Long spuTotalAmount;

	@Override
	public String toString() {
		return "OrderItem{" +
				"orderItemId=" + orderItemId +
				", shopId=" + shopId +
				", orderId=" + orderId +
				", spuId=" + spuId +
				", skuId=" + skuId +
				", userId=" + userId +
				", count=" + count +
				", spuName='" + spuName + '\'' +
				", skuName='" + skuName + '\'' +
				", pic='" + pic + '\'' +
				", deliveryType=" + deliveryType +
				", shopCartTime=" + shopCartTime +
				", price=" + price +
				", spuTotalAmount=" + spuTotalAmount +
				'}';
	}
}
