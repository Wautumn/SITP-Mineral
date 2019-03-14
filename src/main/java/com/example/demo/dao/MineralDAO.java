package com.example.demo.dao;

import com.example.demo.entity.mineral;
import com.example.demo.entity.mineralExample;
import com.example.demo.entity.mineralWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component
public interface MineralDAO {
    int countByExample(mineralExample example);

    int deleteByExample(mineralExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(mineralWithBLOBs record);

    int insertSelective(mineralWithBLOBs record);

    List<mineralWithBLOBs> selectByExampleWithBLOBs(mineralExample example);

    List<mineral> selectByExample(mineralExample example);

    mineralWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") mineralWithBLOBs record, @Param("example") mineralExample example);

    int updateByExampleWithBLOBs(@Param("record") mineralWithBLOBs record, @Param("example") mineralExample example);

    int updateByExample(@Param("record") mineral record, @Param("example") mineralExample example);

    int updateByPrimaryKeySelective(mineralWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(mineralWithBLOBs record);

    int updateByPrimaryKey(mineral record);

    List<mineral> findMineralByName(String name);
}