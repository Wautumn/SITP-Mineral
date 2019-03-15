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
        String result = FileUploadUtils.fileUploadToQiNiu("C://Users//22831//Desktop//SITP//图片//手标本图片//正长石.png","正长石.png");
        System.out.println(result);

        String result2 = FileUploadUtils.fileUploadToQiNiu("C://Users//22831//Desktop//SITP//图片//手标本图片//中长石.png","中长石.png");
        System.out.println(result2);

        String result3 = FileUploadUtils.fileUploadToQiNiu("C://Users//22831//Desktop//SITP//图片//手标本图片//紫苏辉石.png","紫苏辉石.png");
        System.out.println(result3);


    }


}
