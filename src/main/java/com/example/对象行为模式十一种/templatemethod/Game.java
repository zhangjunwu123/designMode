package com.example.对象行为模式十一种.templatemethod;

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // 模板方法
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
