package com.mev.cloud.product.model;

import com.mev.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品sku销售属性关联信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:24
 */
@Setter
@Getter
@ToString
public class SpuSkuAttrValue extends BaseModel implements Serializable{
    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 商品sku销售属性关联信息id
     */
    private Long spuSkuAttrId;

    /**
     * SPU ID
     */
    private Long spuId;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * 销售属性ID
     */
    private Long attrId;

    /**
     * 销售属性名称
     */
    private String attrName;

    /**
     * 销售属性值ID
     */
    private Long attrValueId;

    /**
     * 销售属性值
     */
    private String attrValueName;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;
}
