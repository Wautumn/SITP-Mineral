package com.example.demo.controller;

import com.example.demo.entity.Mineral;
import com.example.demo.service.MineralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MineralController {
    @Autowired
    MineralService mineralService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String first(){
        return "ok";
    }

    @RequestMapping(value = "/getMineralByKeyword",method = RequestMethod.GET)
    public List<Mineral> GetMineralByKeyword(String keyword){
        return mineralService.GetMineralByKeyword(keyword);
    }

}
