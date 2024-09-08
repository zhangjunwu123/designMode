package com.example.对象行为模式十一种.templatemethod;

public class Test {

    public static void main(String[] args) {
        Game criket = new Cricket();
        criket.play();

        Game football = new Football();
        football.play();
    }
}
