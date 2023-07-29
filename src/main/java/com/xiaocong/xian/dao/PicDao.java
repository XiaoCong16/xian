package com.xiaocong.xian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaocong.xian.entity.PicEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PicDao extends BaseMapper<PicEntity> {
    public Integer getTotal();
}
