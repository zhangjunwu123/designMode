package com.example.createMode.prototype;

public class Car implements Cloneable{

    public void draw(){
        System.out.println("绘制");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
