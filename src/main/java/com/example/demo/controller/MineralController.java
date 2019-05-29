package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.*;
import com.example.demo.service.MineralService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.List;

@RestController
public class MineralController {
    @Autowired
    MineralService mineralService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String first() {
        return "ok";
    }

    @RequestMapping(value = "/getMineralByKeyword", method = RequestMethod.GET)
    public List<Mineral> GetMineralByKeyword(String keyword) {
        return mineralService.GetMineralByKeyword(keyword);
    }

    @RequestMapping(value = "/getMineralPic", method = RequestMethod.GET)
    public List<String> GetMineralPic(int id) {
        return mineralService.GetMineralPic(id);
    }

    @RequestMapping(value = "/getHotMineral", method = RequestMethod.GET)
    public List<SuggestForm> GetHotMineral() {
        return mineralService.GetHotMineral();
    }

    @RequestMapping(value = "/getMineral", method = RequestMethod.GET)
    public MineralForm2 GetMineralById(int id) {
        return mineralService.FindMineralById(id);
    }

    @RequestMapping(value = "/findByCases", method = RequestMethod.POST)
    public List<Mineral> findBycases(@RequestBody JSONObject jsonObject) {
        System.out.println(jsonObject);
        String axiality = jsonObject.getString("axiality");
        String type = jsonObject.getString("type");
        String form = jsonObject.getString("form");
        String handspecolor = jsonObject.getString("handspecolor");
        String slicecolor = jsonObject.getString("slicecolor");
        String jieli = jsonObject.getString("jieli");
        String tuqi = jsonObject.getString("tuqi");
        String colorganshe = jsonObject.getString("colorganshe");
        String xiaoguang = jsonObject.getString("xiaoguang");
        String shuangjin = jsonObject.getString("shuangjin");
        String guangxing = jsonObject.getString("guangxing");

        Mineral mineral=new Mineral();
        if(axiality!=null) mineral.setAxiality(axiality);
        if(type!=null) mineral.setType(type);
        if(form!=null) mineral.setForm(form);
        if(handspecolor!=null) mineral.setHandspecolor(handspecolor);
        if(slicecolor!=null) mineral.setSlicecolor(slicecolor);
        if(jieli!=null) mineral.setJieli(jieli);
        if(tuqi!=null) mineral.setTuqi(tuqi);
        if(colorganshe!=null) mineral.setColorganshe(colorganshe);
        if(xiaoguang!=null) mineral.setXiaoguang(xiaoguang);
        if(shuangjin!=null) mineral.setShuangjin(shuangjin);
        if(guangxing!=null) mineral.setGuangxing(guangxing);

        return mineralService.findBycases(mineral);








    }


}
