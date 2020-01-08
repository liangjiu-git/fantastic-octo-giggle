package com.mr.clj.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

public class EasyPoiEntity {
    private Long id;

    @Excel(name = "姓名" ,orderNum = "0" ,width = 15)
    private String name;
    @Excel(name = "性别" ,orderNum = "1" ,width = 15)
    private String sex;
    @Excel(name = "手机号码" ,orderNum = "2" ,width = 15)
    private Integer phone;
    @Excel(name = "生日" ,orderNum = "3" ,width = 15 ,format = "yyyy-MM-dd")
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}