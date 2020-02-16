package com.bu.service.impl;

import com.bu.entity.District;
import com.bu.mapper.DistrictMapper;
import com.bu.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<District> getAll() {
        return districtMapper.getAll();
    }
}
