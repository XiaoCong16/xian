package com.xiaocong.xian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaocong.xian.entity.PicEntity;
import com.xiaocong.xian.entity.PicEntityVo;

public interface PicService extends IService<PicEntity> {

    PicEntityVo getAllUrl(int pagesize, int nowPage);
}
