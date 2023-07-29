package com.xiaocong.xian.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("pic")
public class PicEntity {
    @TableId
    private Long id;
    private String url;

}
