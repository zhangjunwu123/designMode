package com.example.对象行为模式十一种.oberserver;

public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ConcreteOberserver1());
        subject.addObserver(new ConcreteOberserver2());

        subject.setState(3);
    }
}
