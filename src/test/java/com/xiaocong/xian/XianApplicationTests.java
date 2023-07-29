package com.xiaocong.xian;

import com.xiaocong.xian.entity.PicEntity;
import com.xiaocong.xian.service.PicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class XianApplicationTests {

   /* @Autowired
    PicService picService;
    @Test
    void contextLoads() {
        File file = new File("C:\\Users\\吕博聪\\Desktop\\新建文件夹 (4)\\新建文件夹 (2)");
        File[] files = file.listFiles();
        String pre = "https://xiaocong-fangfang-xian.oss-cn-shanghai.aliyuncs.com/";
        long id = 30;
        for (File file1 : files) {
            String name = file1.getName();
            if (name.endsWith(".jpg")){
                PicEntity picEntity = new PicEntity();
                picEntity.setId(id++);
                picEntity.setUrl(pre+name);
                picService.save(picEntity);
                System.out.println(picEntity);
            }
        }
    }*/

}
