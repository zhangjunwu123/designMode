package com.example.创建对象模式五种.prototype;

public class Car implements Cloneable{

    public void draw(){
        System.out.println("绘制");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
