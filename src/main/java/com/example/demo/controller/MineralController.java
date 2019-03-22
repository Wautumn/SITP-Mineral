package com.example.demo.controller;

import com.example.demo.entity.Mineral;
import com.example.demo.entity.MineralMedia;
import com.example.demo.entity.SuggestForm;
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

    @RequestMapping(value = "/getMineralPic",method = RequestMethod.GET)
    public List<String> GetMineralPic(int id){
        return mineralService.GetMineralPic(id);
    }

    @RequestMapping(value = "/getHotMineral",method = RequestMethod.GET)
    public List<SuggestForm> GetHotMineral(){
        return mineralService.GetHotMineral();
    }

    @RequestMapping(value = "/getMedia",method = RequestMethod.GET)
    public MineralMedia GetMedia(int id){
        return mineralService.GetMediaById(id);
    }

    @RequestMapping(value = "/getMediaAPic",method = RequestMethod.GET)
    public List GetMediaAPic(int id){
        return mineralService.GetPicAMedia(id);
    }



}
