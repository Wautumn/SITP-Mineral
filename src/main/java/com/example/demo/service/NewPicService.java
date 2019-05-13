package com.example.demo.service;

import com.example.demo.dao.NewPicMapper;
import com.example.demo.entity.NewPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: WHQ
 * @Date: 2019/5/13 10:49
 */
@Service
public class NewPicService {
    @Autowired
    NewPicMapper newPicMapper;

    public List getPicDan(String name){
        NewPic newPic=newPicMapper.getMineralNewPic(name);
        String danpic=newPic.getPicdan();
        String[] dan=danpic.split(",");
        List result=new ArrayList<String>(Arrays.asList(dan));
        System.out.println(result.size());
        return result;
    }

    public List getPicYun(String name){
        NewPic newPic=newPicMapper.getMineralNewPic(name);
        String yunpic=newPic.getPicyun();
        String[] yun=yunpic.split(",");
        List result=new ArrayList<String>(Arrays.asList(yun));
        System.out.println(result.size());
        return result;
    }

    public List getPicshi(String name){
        NewPic newPic=newPicMapper.getMineralNewPic(name);
        String shipic=newPic.getPicshi();
        String[] shi=shipic.split(",");
        List result=new ArrayList<String>(Arrays.asList(shi));
        System.out.println(result.size());
        return result;
    }

    public List getPiczheng(String name){
        NewPic newPic=newPicMapper.getMineralNewPic(name);
        String zhengpic=newPic.getPiczheng();
        String[] zheng=zhengpic.split(",");
        List result=new ArrayList<String>(Arrays.asList(zheng));
        System.out.println(result.size());
        return result;
    }
}
