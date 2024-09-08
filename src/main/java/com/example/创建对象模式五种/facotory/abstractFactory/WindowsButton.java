package com.example.创建对象模式五种.facotory.abstractFactory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("render windows button");
    }
}
