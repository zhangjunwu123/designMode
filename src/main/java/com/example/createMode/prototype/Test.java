package com.example.createMode.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car();
        Car car2 = (Car) car1.clone();
        car2.draw();
    }
}
