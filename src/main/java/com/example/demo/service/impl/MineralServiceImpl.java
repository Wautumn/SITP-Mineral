package com.example.demo.service.impl;

import com.example.demo.dao.MineralDAO;
import com.example.demo.entity.Mineral;
import com.example.demo.service.MineralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class MineralServiceImpl implements MineralService {


    private MineralDAO mineralDAO;

    public int ifExistMineral(String name){

        if(mineralDAO.findMineralByName(name)==null)
            return 0;
        else
            return 1;
    }

    /*
    name不为空
    找符合条件的唯一矿物记录
     */
    public Mineral findbyname(String name){
        LinkedList<Mineral> minerals=mineralDAO.findMineralByName(name);
        if(minerals.size()==0)
            return null;
        else if(minerals.size()==1)
            return minerals.get(0);
        else
            return null;

    }
}
