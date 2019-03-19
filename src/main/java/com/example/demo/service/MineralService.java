package com.example.demo.service;

import com.example.demo.dao.MineralMapper;
import com.example.demo.dao.MineralMediaMapper;
import com.example.demo.dao.MineralPicMapper;
import com.example.demo.entity.Mineral;
import com.example.demo.entity.MineralMedia;
import com.example.demo.entity.MineralPic;
import com.example.demo.entity.SuggestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MineralService {

    @Autowired
    MineralMapper mineralMapper;

    @Autowired
    MineralPicMapper mineralPicMapper;

    @Autowired
    MineralMediaMapper mineralMediaMapper;

   public List<Mineral> GetMineralByKeyword(String keyword){
       return mineralMapper.FindByKeyword(keyword);
   }

   public List<String> GetMineralPic(int id){
       List<MineralPic> mineralPic=mineralPicMapper.FindPicById(id);
       List<String>  urls=new LinkedList<>();
       for(int i=0;i<mineralPic.size();i++){
           if(mineralPic.get(i).getPic1()!=null) {
               urls.add(mineralPic.get(i).getPic1());
           }
           if(mineralPic.get(i).getPic2()!=null) {
               urls.add(mineralPic.get(i).getPic2());
           }
           if(mineralPic.get(i).getPic3()!=null) {
               urls.add(mineralPic.get(i).getPic3());
           }
       }
       return urls;
   }

   public List<SuggestForm> GetHotMineral(){
       List<SuggestForm> hotMineral=new LinkedList<>();

       for(int i=1;i<20;i++){
         if(hotMineral.size()<8) {
               Mineral mineral = mineralMapper.FindById(i);
              // System.out.println("size" + mineral);
               SuggestForm suggestForm = new SuggestForm();
               suggestForm.setName(mineral.getName());
               suggestForm.setId(mineral.getId());
               suggestForm.setPic(mineralPicMapper.FindPicById(i).get(0).getPic1());
               if(suggestForm.getPic()!=null)
               hotMineral.add(suggestForm);
           }

       }
       return hotMineral;
   }

   public MineralMedia GetMediaById(int id){
       MineralMedia mineralMedia= mineralMediaMapper.FindMediaById(id);
       if(mineralMedia==null){
           System.out.println("no media");
       }
       return mineralMedia;
   }




}
