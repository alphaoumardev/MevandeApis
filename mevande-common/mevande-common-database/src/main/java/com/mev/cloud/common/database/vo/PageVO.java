package com.mev.cloud.common.database.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/9/8
 */
@Setter
@Getter
public class PageVO<T> {

    @Schema(description = "总页数" )
    private Integer pages;

    @Schema(description = "总条目数" )
    private Long total;

    @Schema(description = "结果集" )
    private List<T> list;

    @Override
    public String toString() {
        return "PageVO{" +
                ", pages=" + pages +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
