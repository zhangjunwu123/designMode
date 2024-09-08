package com.example.对象行为模式十一种.oberserver;

public class ConcreteOberserver1 implements Oberserver{
    @Override
    public void update(int state) {
        System.out.println("observer1 接收到更新通知 " + state);
    }
}
