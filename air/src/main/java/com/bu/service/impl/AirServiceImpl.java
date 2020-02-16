package com.bu.service.impl;

import com.bu.entity.Air;
import com.bu.mapper.AirMapper;
import com.bu.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirServiceImpl implements AirService {
    @Autowired
    private AirMapper airMapper;
    @Override
    public int add(Air air) {
        return airMapper.add(air);
    }

    @Override
    public int delById(Integer id) {
        return airMapper.delById(id);
    }

    @Override
    public int updateById(Air air) {
        return airMapper.updateById(air);
    }

    @Override
    public List<Air> getAll() {
        System.out.println("222");
        return airMapper.getAll();
    }

    @Override
    public Air getById(Integer id) {
        return airMapper.getById(id);
    }
}
