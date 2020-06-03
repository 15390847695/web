package com.hzit.bean;

import java.util.Date;

public class Teacher {


    private int id;
    private String tnumber;
    private String tname;
    private Date tbirthday;
    private String tgender;
    private String tmajor;
    private String tphone;

    @Override
    public String toString() {   //重写tostring
        return "Teacher{" +
                "id=" + id +
                ", tnumber='" + tnumber + '\'' +
                ", tname='" + tname + '\'' +
                ", tbirthday=" + tbirthday +
                ", tgender='" + tgender + '\'' +
                ", tmajor='" + tmajor + '\'' +
                ", tphone='" + tphone + '\'' +
                '}';
    }
//构造函数
    public Teacher(String tnumber, String tname, Date tbirthday, String tgender, String tmajor, String tphone) {
        this.tnumber = tnumber;
        this.tname = tname;
        this.tbirthday = tbirthday;
        this.tgender = tgender;
        this.tmajor = tmajor;
        this.tphone = tphone;
    }
//构造函数加了id参数
    public Teacher(int id, String tnumber, String tname, Date tbirthday, String tgender, String tmajor, String tphone) {
        this.id = id;
        this.tnumber = tnumber;
        this.tname = tname;
        this.tbirthday = tbirthday;
        this.tgender = tgender;
        this.tmajor = tmajor;
        this.tphone = tphone;
    }
//空构造函数
    public Teacher() {
    }
//生成get、set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(Date tbirthday) {
        this.tbirthday = tbirthday;
    }

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public String getTmajor() {
        return tmajor;
    }

    public void setTmajor(String tmajor) {
        this.tmajor = tmajor;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }
}
