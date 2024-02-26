package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 库存锁定信息
 *
 * @author Alphaoumardev
 * @date 2020-12-22 16:12:10
 */
@Setter
@Getter
@ToString
public class SkuStockLock extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * sku id
     */
    private Long skuId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 锁定库存数量
     */
    private Integer count;

    /**
     * 状态-1已解锁 0待确定 1已锁定
     */
    private Integer status;

}
