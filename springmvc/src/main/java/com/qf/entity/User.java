package com.qf.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {
    private Integer uid;
    private  String username;
    private  String password;

    private Car car;
    private List<Car> list;
    private Map<String,Car> map;

    private Date birth;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    public Map<String, Car> getMap() {
        return map;
    }

    public void setMap(Map<String, Car> map) {
        this.map = map;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", car=" + car +
                ", list=" + list +
                ", map=" + map +
                ", birth=" + birth +
                '}';
    }

    public User(Integer uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
