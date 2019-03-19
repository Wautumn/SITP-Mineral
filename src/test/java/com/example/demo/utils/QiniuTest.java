package com.example.demo.utils;


import com.example.demo.other.FileUploadUtils;
import com.example.demo.other.MediaUploadUtils;
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
        // MediaUploadUtils.fileUploadToQiNiu("C://Users//22831//Desktop//SITP//WeChat_20190315222216.mp4","WeChat_20190315222216.mp4");
        MediaUploadUtils.fileUploadToQiNiu("C://Users//22831//Desktop/SITP//成品视频1批//单斜辉石单偏光镜.3gp","单斜辉石单偏光镜.3gp");







    }


}
