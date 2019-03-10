package com.example.demo.service;

import com.example.demo.entity.Mineral;
import com.example.demo.service.impl.MineralServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MineralServiceTest {

    @Autowired
    MineralServiceImpl mineralService;

    @Test
    public void findByNameTest(){
       int i=mineralService.ifExistMineral("钠长石");
       System.out.println(i);



    }

}
