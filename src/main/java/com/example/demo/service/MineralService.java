package com.example.demo.service;

import com.example.demo.dao.MineralMapper;
import com.example.demo.entity.Mineral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MineralService {

    @Autowired
    MineralMapper mineralMapper;

   public List<Mineral> GetMineralByKeyword(String keyword){
       return mineralMapper.FindByKeyword(keyword);
   }


}
