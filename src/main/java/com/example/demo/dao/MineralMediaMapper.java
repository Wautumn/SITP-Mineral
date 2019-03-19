package com.example.demo.dao;

import com.example.demo.entity.MineralMedia;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MineralMediaMapper {
    MineralMedia FindMediaById(int id);
}
