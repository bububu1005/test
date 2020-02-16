package com.bu.service;

import com.bu.entity.Air;

import java.util.List;

public interface AirService {

    int add(Air air);

    int delById(Integer id);

    int updateById(Air air);

    List<Air> getAll();

    Air getById(Integer id);
}
