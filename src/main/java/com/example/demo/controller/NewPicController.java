package com.example.demo.controller;

import com.example.demo.service.NewPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: WHQ
 * @Date: 2019/5/13 11:03
 */
@RestController
public class NewPicController {

    @Autowired
    NewPicService newPicService;


    @RequestMapping(value = "/getDan",method = RequestMethod.GET)
    public List getDanNewPic(String name){
        return newPicService.getPicDan(name);
    }

    @RequestMapping(value = "/getYun",method = RequestMethod.GET)
    public List getYunNewPic(String name){
        return newPicService.getPicYun(name);
    }

    @RequestMapping(value = "/getShi",method = RequestMethod.GET)
    public List getShiNewPic(String name){
        return newPicService.getPicshi(name);
    }

    @RequestMapping(value = "/getZheng",method = RequestMethod.GET)
    public List getZhengNewPic(String name){
        return newPicService.getPiczheng(name);
    }

}
