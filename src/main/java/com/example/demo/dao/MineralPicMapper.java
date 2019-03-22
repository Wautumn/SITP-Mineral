package com.example.demo.dao;

import com.example.demo.entity.MineralPic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MineralPicMapper {
    MineralPic FindPicById(int id);
}
