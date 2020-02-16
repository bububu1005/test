package com.bu.mapper;

import com.bu.entity.District;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictMapper {
    @Select("select * from district")
    List<District> getAll();
}
