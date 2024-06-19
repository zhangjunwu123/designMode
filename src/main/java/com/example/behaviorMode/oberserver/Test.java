package com.example.behaviorMode.oberserver;

public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ConcreteOberserver1());
        subject.addObserver(new ConcreteOberserver2());

        subject.setState(3);
    }
}
