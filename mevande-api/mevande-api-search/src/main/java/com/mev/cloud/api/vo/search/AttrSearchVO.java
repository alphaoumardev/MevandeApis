package com.mev.cloud.api.vo.search;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/11/17
 */
@Setter
@Getter
public class AttrSearchVO
{

    @Schema(description = "规格id" )
    private Long attrId;

    @Schema(description = "规格名" )
    private String attrName;

    @Schema(description = "规格值列表" )
    private List<AttrValueSearchVO> attrValues;

    @Override
    public String toString() {
        return "AttrVO{" +
                "attrId=" + attrId +
                ", attrName='" + attrName + '\'' +
                ", attrValues=" + attrValues +
                '}';
    }
}
