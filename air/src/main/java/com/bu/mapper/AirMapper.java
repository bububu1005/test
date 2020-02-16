package com.bu.mapper;

import com.bu.entity.Air;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirMapper {

    @Insert("insert into air () values ()")
    int add(Air air);
    @Delete("delete from air where id=#{id}")
    int delById(Integer id);
    @Update("update air set pm10=#{pm10} where id=#{id}")
    int updateById(Air air);

    List<Air> getAll();
    @Select("select * from air where id=#{id}")
    Air getById(Integer id);
}
