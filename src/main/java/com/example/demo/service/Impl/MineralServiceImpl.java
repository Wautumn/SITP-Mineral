package com.example.demo.service.Impl;

import com.example.demo.dao.MineralDAO;
import com.example.demo.entity.mineral;
import com.example.demo.service.MineralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MineralServiceImpl implements MineralService {
    @Autowired
    private MineralDAO mineralDAO;

    private List<mineral> mineralbyname;

    public void getListByName(String name){
        mineralbyname= mineralDAO.findMineralByName(name);
    }

    public int ifexist(String name){
        getListByName(name);
        if(mineralbyname.size()==0)
            return 0;
        else
            return 1;
    }

    public mineral getMineralByName(String name){
        return mineralbyname.get(0);
    }
}
