package com.example.demo.service;

import com.example.demo.dao.MineralMapper;
import com.example.demo.dao.MineralPicMapper;
import com.example.demo.entity.Mineral;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Min;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MineralServiceTest {

    @Autowired
    MineralService mineralService;

    @Autowired
    MineralMapper mineralMapper;

    @Autowired
    MineralPicMapper mineralPicMapper;

    @Test
    public void findByKeyword(){
        System.out.println(mineralMapper.FindByKeyword("无色").size());
    }


    @Test
    public void findByName(){
        System.out.println(mineralMapper.FindByName("钠长").size());
    }

    @Test
    public void findByType(){
        System.out.println(mineralMapper.FindById(2).getName());
    }

    @Test
    public void findPic(){
        System.out.println(mineralService.GetMineralPic(2));
    }


    @Test
    public void findbycases(){
        Mineral mineral=new Mineral();
        mineral.setGuangxing("正");
        mineral.setHandspecolor("白色");
        mineral.setXiaoguang("斜");
        List<Mineral> mineralli=mineralMapper.FindByCases(mineral);
        System.out.println(mineralli.size());
        for(Mineral m:mineralli) {
            System.out.println(m.getName());
        }
    }
}
