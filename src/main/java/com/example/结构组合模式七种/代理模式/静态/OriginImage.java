package com.example.结构组合模式七种.代理模式.静态;

import com.example.结构组合模式七种.代理模式.Image;

public class OriginImage implements Image {
    @Override
    public void draw() {
        System.out.println("OriginImage draw");
    }
}
