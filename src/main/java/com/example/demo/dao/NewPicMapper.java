package com.example.demo.dao;

import com.example.demo.entity.NewPic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author: WHQ
 * @Date: 2019/5/13 10:43
 */
@Mapper
@Component
public interface NewPicMapper {
    NewPic getMineralNewPic(String name);

    NewPic getMineralNewPicById(int id);
}
