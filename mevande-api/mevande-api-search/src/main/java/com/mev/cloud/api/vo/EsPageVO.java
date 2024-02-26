package com.mev.cloud.api.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/11/16
 */
@Setter
@Getter
public class EsPageVO<T>
{

    @Schema(description = "总页数" )
    private Integer pages;

    @Schema(description = "总条目数" )
    private Long total;

    @Schema(description = "结果集" )
    private List<T> list;

    @Override
    public String toString() {
        return "EsPageVO{" +
                ", pages=" + pages +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
