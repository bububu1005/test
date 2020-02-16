package com.bu;

import com.bu.entity.Air;
import com.bu.service.AirService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AirApplicationTests {

    @Autowired
    private AirService airService;
    @Test
    void contextLoads() {
        List<Air> airList = airService.getAll();
        for(Air air: airList){
            System.out.println(air);
        }
    }

}
