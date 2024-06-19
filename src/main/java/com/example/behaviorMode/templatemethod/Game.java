package com.example.behaviorMode.templatemethod;

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
