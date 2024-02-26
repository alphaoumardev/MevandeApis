package com.mev.cloud.api.product.bo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/11/12
 */
@Setter
@Getter
public class EsAttrBO {

    /**
     * 规格id
     */
    private Long attrId;

    /**
     * 规格名
     */
    private String attrName;

    /**
     * 规格值id
     */
    private Long attrValueId;

    /**
     * 规格值名称
     */
    private String attrValueName;

    @Override
    public String toString() {
        return "EsAttrBO{" +
                "attrId=" + attrId +
                ", attrName='" + attrName + '\'' +
                ", attrValueId=" + attrValueId +
                ", attrValueName='" + attrValueName + '\'' +
                '}';
    }
}
