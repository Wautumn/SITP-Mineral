package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;


public class Mineral {

    @Id
    @Column(name="ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="TYPE")
    private String type;

    @Column(name="INTRODUCTION")
    private String introduction;

    @Column(name="COLOR")
    private String color;

    @Column(name="JIELI")
    private String jieli;

    @Column(name="TUQI")
    private String tuqi;

    @Column(name="COLORGANSHE")
    private String colorganshe;

    @Column(name="XIAOGAUNG")
    private String xiaoguang;

    @Column(name="SHUANGJING")
    private String shuangjinG;

    @Column(name="GUANGXING")
    private String guangxing;

    @Column(name="PIC1")
    private byte pic1;

    @Column(name="PIC2")
    private byte pic2;

    @Column(name="PIC3")
    private byte pic3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getJieli() {
        return jieli;
    }

    public void setJieli(String jieli) {
        this.jieli = jieli;
    }

    public String getTuqi() {
        return tuqi;
    }

    public void setTuqi(String tuqi) {
        this.tuqi = tuqi;
    }

    public String getColorganshe() {
        return colorganshe;
    }

    public void setColorganshe(String colorganshe) {
        this.colorganshe = colorganshe;
    }

    public String getXiaoguang() {
        return xiaoguang;
    }

    public void setXiaoguang(String xiaoguang) {
        this.xiaoguang = xiaoguang;
    }

    public String getShuangjinG() {
        return shuangjinG;
    }

    public void setShuangjinG(String shuangjinG) {
        this.shuangjinG = shuangjinG;
    }

    public String getGuangxing() {
        return guangxing;
    }

    public void setGuangxing(String guangxing) {
        this.guangxing = guangxing;
    }

    public byte getPic1() {
        return pic1;
    }

    public void setPic1(byte pic1) {
        this.pic1 = pic1;
    }

    public byte getPic2() {
        return pic2;
    }

    public void setPic2(byte pic2) {
        this.pic2 = pic2;
    }

    public byte getPic3() {
        return pic3;
    }

    public void setPic3(byte pic3) {
        this.pic3 = pic3;
    }
}
