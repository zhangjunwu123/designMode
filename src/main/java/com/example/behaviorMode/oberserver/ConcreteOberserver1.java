package com.example.behaviorMode.oberserver;

public class ConcreteOberserver1 implements Oberserver{
    @Override
    public void update(int state) {
        System.out.println("observer1 接收到更新通知 " + state);
    }
}
