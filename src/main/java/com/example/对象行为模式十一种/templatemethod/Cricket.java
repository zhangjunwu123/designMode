package com.example.对象行为模式十一种.templatemethod;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("板球游戏：初始化");
    }

    @Override
    void startPlay() {
        System.out.println("板球游戏：开始");
    }

    @Override
    void endPlay() {
        System.out.println("板球游戏：结束");
    }
}
