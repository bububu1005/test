package com.qf.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {


    @Override
    public Date convert(String s) {
        if (s==null){
            throw  new RuntimeException();
        }
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date = simpleDateFormat.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
        }


        return date;
    }
}
