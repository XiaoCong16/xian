package com.xiaocong.xian.controller;

import com.xiaocong.xian.entity.PicEntityVo;
import com.xiaocong.xian.service.PicService;
import com.xiaocong.xian.utils.R;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@Slf4j
public class PicController {

    @Autowired
    PicService picService;

    private static int n = 0;

    @ResponseBody
    @RequestMapping(value = {"/getAllUrl"})
    public R getAllUrl(int pagesize, int nowPage) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        String format = sdf.format(date);
//        System.out.println(format + "::我来了" + n++);
        PicEntityVo urls = picService.getAllUrl(pagesize, nowPage);
        log.info(format + "::我来了" + n++);
        return R.ok().put("urls", urls);
    }
}
