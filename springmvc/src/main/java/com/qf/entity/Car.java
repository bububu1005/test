package com.qf.entity;

public class Car {
    private String cname;
    private  String ccolor;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", ccolor='" + ccolor + '\'' +
                '}';
    }
}
