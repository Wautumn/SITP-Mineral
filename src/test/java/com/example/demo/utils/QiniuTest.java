package com.example.demo.utils;


import com.example.demo.other.FileUploadUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class QiniuTest {


    @Test
    public void testupload() throws Exception {
// 第一个参数 上传文件的位置
// 第二个上传文件的名称
        String result = FileUploadUtils.fileUploadToQiNiu("C://Users//22831//Desktop//SITP//图片//透明薄片图片（显微镜下）002//石榴子石.png","石榴子石.png");
        System.out.println(result);






    }


}
