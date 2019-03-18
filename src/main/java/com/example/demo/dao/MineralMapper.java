package com.example.demo.dao;

import com.example.demo.entity.Mineral;
import com.example.demo.entity.SuggestForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MineralMapper {
    List<Mineral> FindByKeyword(String keyword);

    Mineral FindById(int id);

    List<Mineral> FindByName(String name);

    List<Mineral> FindByType(String type);







}
