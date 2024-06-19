package com.example.behaviorMode.templatemethod;

public class Test {

    public static void main(String[] args) {
        Game criket = new Cricket();
        criket.play();

        Game football = new Football();
        football.play();
    }
}
