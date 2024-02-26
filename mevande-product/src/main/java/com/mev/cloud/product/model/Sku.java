package com.mev.cloud.product.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * sku信息
 *
 * @author Alphaoumardev
 * @date 2020-12-08 15:54:22
 */
@Setter
@Getter
@ToString
public class Sku extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    private Long skuId;

    /**
     * SPU id
     */
    private Long spuId;

    /**
     * 多个销售属性值id逗号分隔
     */
    private String attrs;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * sku图片
     */
    private String imgUrl;

    /**
     * 售价，整数方式保存
     */
    private Long priceFee;

    /**
     * 市场价，整数方式保存
     */
    private Long marketPriceFee;

    /**
     * 商品编码
     */
    private String partyCode;

    /**
     * 商品条形码
     */
    private String modelId;

    /**
     * 商品重量
     */
    private BigDecimal weight;

    /**
     * 商品体积
     */
    private BigDecimal volume;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;
}
