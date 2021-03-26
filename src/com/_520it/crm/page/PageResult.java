package com._520it.crm.page;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class PageResult {
//返回查询出来的数据总数和数据数组
    private Integer total;
    private List rows;

    public PageResult(Integer total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}


