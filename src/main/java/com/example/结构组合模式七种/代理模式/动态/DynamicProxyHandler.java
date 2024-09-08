package com.example.结构组合模式七种.代理模式.动态;

import com.example.结构组合模式七种.代理模式.Image;
import com.example.结构组合模式七种.代理模式.静态.OriginImage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 这个类是处理器，是指在Proxy动态生成代理过程中的一些自定义业务逻辑
 * ，动态编织一些代码形成代理类
 * 或者可以称为代理类生成器,
 * */
public class DynamicProxyHandler implements InvocationHandler {
    private Image orginImage;
    public DynamicProxyHandler(OriginImage originImage){
        this.orginImage = originImage;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preDraw();
        Object result = method.invoke(orginImage, args);
        postDraw();
        return result;
    }

    private void postDraw() {
        System.out.println("代理对象在draw后置业务逻辑");
    }

    private void preDraw() {
        System.out.println("代理对象在draw前置进行业务处理");
    }
}
