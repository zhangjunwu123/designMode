package com.example.结构组合模式七种.代理模式.静态;

import com.example.结构组合模式七种.代理模式.Image;

public class ProxyImage implements Image {
    private OriginImage originImage;

    @Override
    public void draw() {
        //怎么注入原对象可以自定义实现
        if(originImage == null){
            originImage = new OriginImage();
        }
        preDraw();
        originImage.draw();
        postDraw();
    }

    private void postDraw() {
        System.out.println("代理对象在draw后置业务逻辑");
    }

    private void preDraw() {
        System.out.println("代理对象在draw前置进行业务处理");
    }
}
