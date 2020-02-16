package com.bu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Air {

  private Long id;
  private Long district_id;
  private Date monitor_time;
  private Long pm10;
  private Long pm25;
  private String monitoring_station;
  private Date last_modify_time;

  private District district;
}
