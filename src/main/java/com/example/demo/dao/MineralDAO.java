package com.example.demo.dao;

import com.example.demo.entity.Mineral;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;

@Repository
public interface MineralDAO {
    LinkedList<Mineral> findMineralByName(String name);//通过矿物名称查找


}
