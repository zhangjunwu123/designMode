package com.example.结构组合模式七种.代理模式;

import com.example.结构组合模式七种.代理模式.动态.DynamicProxyHandler;
import com.example.结构组合模式七种.代理模式.静态.OriginImage;
import com.example.结构组合模式七种.代理模式.静态.ProxyImage;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage();
        image.draw();
        System.out.println("=========================================");
        OriginImage image1 = new OriginImage();
        Image image2 = (Image) Proxy.newProxyInstance(image1.getClass().getClassLoader(),
                image1.getClass().getInterfaces(), new DynamicProxyHandler(image1));
        image2.draw();
    }
}
