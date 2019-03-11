package com.example.demo.entity;

public class mineralWithBLOBs extends mineral {
    private byte[] pic1;

    private byte[] pic2;

    private byte[] pic3;

    public byte[] getPic1() {
        return pic1;
    }

    public void setPic1(byte[] pic1) {
        this.pic1 = pic1;
    }

    public byte[] getPic2() {
        return pic2;
    }

    public void setPic2(byte[] pic2) {
        this.pic2 = pic2;
    }

    public byte[] getPic3() {
        return pic3;
    }

    public void setPic3(byte[] pic3) {
        this.pic3 = pic3;
    }
}