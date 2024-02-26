package com.mev.cloud.common.database.util;

import com.mev.cloud.common.database.dto.PageDTO;
import lombok.Getter;
import lombok.Setter;


/**
 * 分页适配
 * @author Alphaoumardev
 */
@Setter
@Getter
public class PageAdapter {

    private int begin;

    private int size;

    public PageAdapter(PageDTO page) {
        this.begin = getStart(page.getPageNum() - 1, page.getPageSize());
        this.size = page.getPageSize();
    }

    public static int getStart(int pageNo, int pageSize) {
        if (pageNo < 0) {
            pageNo = 0;
        }

        if (pageSize < 1) {
            pageSize = 0;
        }

        return pageNo * pageSize;
    }

}
