package com.xiaocong.xian.entity;

import lombok.Data;

import java.util.List;

@Data
public class PicEntityVo {
    private List<String> urls;
    private Integer pagesize;
    private Integer totalPage;
    private Integer nowPage;
}
