package com.example.demo.entity;

public class mineral {
    private Integer id;

    private String name;

    private String type;

    private String introduction;

    private String color;

    private String jieli;

    private String tuqi;

    private String colorganshe;

    private String xiaoguang;

    private String shuangjing;

    private String guangxing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getJieli() {
        return jieli;
    }

    public void setJieli(String jieli) {
        this.jieli = jieli == null ? null : jieli.trim();
    }

    public String getTuqi() {
        return tuqi;
    }

    public void setTuqi(String tuqi) {
        this.tuqi = tuqi == null ? null : tuqi.trim();
    }

    public String getColorganshe() {
        return colorganshe;
    }

    public void setColorganshe(String colorganshe) {
        this.colorganshe = colorganshe == null ? null : colorganshe.trim();
    }

    public String getXiaoguang() {
        return xiaoguang;
    }

    public void setXiaoguang(String xiaoguang) {
        this.xiaoguang = xiaoguang == null ? null : xiaoguang.trim();
    }

    public String getShuangjing() {
        return shuangjing;
    }

    public void setShuangjing(String shuangjing) {
        this.shuangjing = shuangjing == null ? null : shuangjing.trim();
    }

    public String getGuangxing() {
        return guangxing;
    }

    public void setGuangxing(String guangxing) {
        this.guangxing = guangxing == null ? null : guangxing.trim();
    }
}