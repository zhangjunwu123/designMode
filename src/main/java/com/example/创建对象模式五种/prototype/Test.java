package com.example.创建对象模式五种.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car();
        Car car2 = (Car) car1.clone();
        car2.draw();
    }
}
