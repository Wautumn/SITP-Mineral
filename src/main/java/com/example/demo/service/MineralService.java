package com.example.demo.service;

import com.example.demo.dao.MineralMapper;
import com.example.demo.dao.MineralMediaMapper;
import com.example.demo.dao.MineralPicMapper;
import com.example.demo.entity.*;
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

   public List GetMineralByKeyword(String keyword){
       List<Mineral> minerals= mineralMapper.FindByKeyword(keyword);
       List result=new LinkedList();
       for(Mineral m:minerals){
           String pic=GetOnePic(m.getId());
           MineralForm mineralForm=new MineralForm();
           mineralForm.setPic1(pic);
           mineralForm.setAxiality(m.getAxiality());
           mineralForm.setColorganshe(m.getColorganshe());
           mineralForm.setForm(m.getForm());
           mineralForm.setGuangxing(m.getGuangxing());
           mineralForm.setHandspecolor(m.getHandspecolor());
           mineralForm.setId(m.getId());
           mineralForm.setJieli(m.getJieli());
           mineralForm.setName(m.getName());
           mineralForm.setType(m.getType());
           mineralForm.setSlicecolor(m.getSlicecolor());
           mineralForm.setTuqi(m.getTuqi());
           mineralForm.setXiaoguang(m.getXiaoguang());
           mineralForm.setShuangjin(m.getShuangjin());
           result.add(mineralForm);
       }
       return result;
   }

   public MineralForm2 FindMineralById(int id){
       MineralMedia mineralMedia=mineralMediaMapper.FindMediaById(id);
       Mineral mineral=mineralMapper.FindById(id);
       MineralPic mineralPic=mineralPicMapper.FindPicById(id);

       MineralForm2 mineralForm=new MineralForm2();

       String[] pics=new String[2];
       pics[0]=mineralPic.getPic1();
       pics[1]=mineralPic.getPic2();

       String[] medias=new String[4];
       medias[0]=mineralMedia.getMediadan();
       medias[1]=mineralMedia.getMediashi();
       medias[2]=mineralMedia.getMediayun();
       medias[3]=mineralMedia.getMediazheng();


       mineralForm.setPics(pics);
       mineralForm.setMedias(medias);

       mineralForm.setId(id);
       mineralForm.setName(mineral.getName());
       mineral.setAxiality(mineral.getAxiality());
       mineral.setType(mineral.getType());
       mineralForm.setForm(mineral.getForm());
       mineralForm.setHandspecolor(mineral.getHandspecolor());
       mineralForm.setSlicecolor(mineral.getSlicecolor());
       mineralForm.setJieli(mineral.getJieli());
       mineralForm.setTuqi(mineral.getTuqi());
       mineralForm.setColorganshe(mineral.getColorganshe());
       mineralForm.setXiaoguang(mineral.getXiaoguang());
       mineralForm.setShuangjin(mineral.getShuangjin());
       mineralForm.setGuangxing(mineral.getGuangxing());
    //   mineralForm.setMediadan(mineralMedia.getMediadan());
     //  mineralForm.setMediashi(mineralMedia.getMediashi());
      // mineralForm.setMediayun(mineralMedia.getMediayun());
      // mineralForm.setMediazheng(mineralMedia.getMediazheng());*/
       return mineralForm;

   }

   public List<String> GetMineralPic(int id){
       MineralPic mineralPic=mineralPicMapper.FindPicById(id);
       List<String>  urls=new LinkedList<>();
           if(mineralPic.getPic1()!=null) {
               urls.add(mineralPic.getPic1());
           }
           if(mineralPic.getPic2()!=null) {
               urls.add(mineralPic.getPic2());
           }
           if(mineralPic.getPic3()!=null) {
               urls.add(mineralPic.getPic3());
           }
       return urls;
   }

   public String GetOnePic(int id){
       String onemineralpic;
       MineralPic mineralPic=mineralPicMapper.FindPicById(id);
       if(mineralPic.getPic1()!=null) {
           onemineralpic=mineralPic.getPic1();
       }
       else if(mineralPic.getPic2()!=null) {
           onemineralpic=mineralPic.getPic2();
       }
       else if(mineralPic.getPic3()!=null) {
           onemineralpic=mineralPic.getPic3();
       }
       else
           return null;
       return onemineralpic;

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
               suggestForm.setPic(mineralPicMapper.FindPicById(i).getPic1());
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

   public List GetPicAMedia(int id){
       List<PicAMedia> result=new LinkedList();
       MineralPic mineralPics=mineralPicMapper.FindPicById(id);
       MineralMedia mineralMedia=mineralMediaMapper.FindMediaById(id);
       PicAMedia picAMedia=new PicAMedia();
       picAMedia.setMineralid(id);
       picAMedia.setName(mineralMedia.getName());
       picAMedia.setPic1(mineralPics.getPic1());
       picAMedia.setPic2(mineralPics.getPic2());
       picAMedia.setMediadan(mineralMedia.getMediadan());
       picAMedia.setMediashi(mineralMedia.getMediashi());
       picAMedia.setMediayun(mineralMedia.getMediayun());
       picAMedia.setMediazheng(mineralMedia.getMediazheng());
       result.add(picAMedia);
       return result;

   }




}
