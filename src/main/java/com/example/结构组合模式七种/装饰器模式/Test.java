package com.example.结构组合模式七种.装饰器模式;

public class Test {

    public static void main(String[] args) {
        new TransformWarrior(new StrongWarror(new CommonWarrior())).fight();
    }
}
