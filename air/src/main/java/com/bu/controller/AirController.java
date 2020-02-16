package com.bu.controller;

import com.bu.entity.Air;
import com.bu.entity.District;
import com.bu.service.AirService;
import com.bu.service.DistrictService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AirController {
    @Autowired
    private AirService airService;
    @Autowired
    private DistrictService districtService;

    @RequestMapping("getAll")
    public String getAll(Model model,Integer pageNum){
        PageHelper.startPage(pageNum,5);
        List<Air> airList = airService.getAll();
        PageInfo<Air> pageInfo=new PageInfo<>(airList);
        model.addAttribute("pageInfo",airList);
        System.out.println(pageInfo);

        List<District> districtList = districtService.getAll();
        model.addAttribute("districtList",districtList);

        //获得当前页
        //model.addAttribute("pageNum", pageInfo.getPageNum());
        //获得一页显示的条数
        //model.addAttribute("pageSize", pageInfo.getPageSize());
        //是否是第一页
        model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
        //获得总页数
        //model.addAttribute("totalPages", pageInfo.getPages());
        //是否是最后一页
        model.addAttribute("isLastPage", pageInfo.isIsLastPage());

        return "airList";
    }

    @RequestMapping("getByDid")
    public String getByDid(Integer did){
        System.out.println(did+"-----------------------------------------------------------------------------------------------");
        return "";
   }
}
