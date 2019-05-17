package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: WHQ
 * @Date: 2019/5/13 10:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewPicServiceTest {

    @Autowired
    NewPicService newPicService;

    @Test
    public void test() {
        newPicService.getPicDan("更长石");
        newPicService.getPicDan("中长石");
        newPicService.getPicDan("黑云母");
        newPicService.getPicDan("白云母");
        newPicService.getPicDan("普通角闪石");
        newPicService.getPicDan("白云石");
        newPicService.getPicDan("硬石膏");
        newPicService.getPicDan("伊丁石");
        newPicService.getPicDan("钙铁榴石");
    }

    @Test
    public void test1() {
        newPicService.getPicYun("更长石");
        newPicService.getPicYun("中长石");
        newPicService.getPicYun("黑云母");
        newPicService.getPicYun("白云母");
        newPicService.getPicYun("普通角闪石");
        newPicService.getPicYun("白云石");
        newPicService.getPicYun("硬石膏");
        newPicService.getPicYun("伊丁石");
        newPicService.getPicYun("钙铁榴石");
    }

    @Test
    public void test2() {
        newPicService.getPicshi("更长石");
        newPicService.getPicshi("中长石");
        newPicService.getPicshi("黑云母");
        newPicService.getPicshi("白云母");
        newPicService.getPicshi("普通角闪石");
        newPicService.getPicshi("白云石");
        newPicService.getPicshi("硬石膏");
        newPicService.getPicshi("伊丁石");
        newPicService.getPicshi("钙铁榴石");
    }

    @Test
    public void test3() {
        newPicService.getPiczheng("更长石");
        newPicService.getPiczheng("中长石");
        newPicService.getPiczheng("黑云母");
        newPicService.getPiczheng("白云母");
        newPicService.getPiczheng("普通角闪石");
        newPicService.getPiczheng("白云石");
        newPicService.getPiczheng("硬石膏");
        newPicService.getPiczheng("伊丁石");
        newPicService.getPiczheng("钙铁榴石");
    }
}
