package com.xiaocong.xian.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaocong.xian.dao.PicDao;
import com.xiaocong.xian.entity.PicEntity;
import com.xiaocong.xian.entity.PicEntityVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("picService")
public class PicServiceImpl extends ServiceImpl<PicDao, PicEntity> implements PicService {

    @Override
    public PicEntityVo getAllUrl(int pagesize, int nowPage) {
        System.out.println(nowPage);
        List<PicEntity> list = this.list(new QueryWrapper<PicEntity>().last(" limit " +(nowPage*pagesize) + "," + pagesize));
        List<String> urls = new ArrayList<>();
        if (list != null) {
            for (PicEntity picEntity : list) {
                urls.add(picEntity.getUrl());
            }
        }
        PicEntityVo picEntityVo = new PicEntityVo();
        picEntityVo.setUrls(urls);
        Integer total = baseMapper.getTotal();
        int i = total / pagesize;
        int i1 = total % pagesize == 0 ? 0 : 1;
        picEntityVo.setTotalPage(i + i1);
        picEntityVo.setNowPage(nowPage);
        return picEntityVo;
    }
}
