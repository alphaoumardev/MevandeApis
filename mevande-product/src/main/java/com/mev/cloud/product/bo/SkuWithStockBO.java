package com.mev.cloud.product.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/12/30
 */
@Setter
@Getter
public class SkuWithStockBO {

    private Long id;

    private Long skuId;

    private Long spuId;

    private Integer count;

    @Override
    public String toString() {
        return "SkuWithStockBO{" +
                "id=" + id +
                ", skuId=" + skuId +
                ", spuId=" + spuId +
                ", count=" + count +
                '}';
    }
}
