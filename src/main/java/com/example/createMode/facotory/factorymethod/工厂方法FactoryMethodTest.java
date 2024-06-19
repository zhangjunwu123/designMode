package com.example.createMode.facotory.factorymethod;

import com.example.createMode.facotory.Shape;

/**
 * 工厂模式是一种创建型设计模式，它提供了一种创建对象的最佳方式，而无需向客户端暴露创建逻辑。
 * 在Java中，工厂模式通常通过一个工厂类来实现对象的实例化，这样可以降低耦合性，使代码更加灵活
 *

 * */
public class 工厂方法FactoryMethodTest {

    public static void main(String[] args) {
        ShapeFactoryMethodFactory shapeFactoryMethodFactory = new CircleFactory();
        Shape shape = shapeFactoryMethodFactory.createShape();
        shape.draw();
    }
}
