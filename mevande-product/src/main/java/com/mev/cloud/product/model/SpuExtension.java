package com.mev.cloud.product.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author Alphaoumardev
 * @date 2020-11-11 13:49:06
 */
@Setter
@Getter
@ToString
public class SpuExtension extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 商品扩展信息表id
     */
    private Long spuExtendId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 销量
     */
    private Integer saleNum;

    /**
     * 实际库存
     */
    private Integer actualStock;

    /**
     * 锁定库存
     */
    private Integer lockStock;

    /**
     * 可售卖库存
     */
    private Integer stock;

}
