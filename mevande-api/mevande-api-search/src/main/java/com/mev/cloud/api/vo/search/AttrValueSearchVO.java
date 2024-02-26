package com.mev.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alphaoumardev
 * @date 2020/11/17
 */
@Setter
@Getter
public class AttrValueSearchVO
{

    @Schema(description = "规格值id" )
    private Long attrValueId;

    @Schema(description = "规格值名称" )
    private String attrValueName;

    @Override
    public String toString() {
        return "AttrValueVO{" +
                "attrValueId=" + attrValueId +
                ", attrValueName='" + attrValueName + '\'' +
                '}';
    }
}
