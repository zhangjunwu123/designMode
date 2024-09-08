package com.example.创建对象模式五种.facotory.factorymethod;

import com.example.创建对象模式五种.facotory.Circle;
import com.example.创建对象模式五种.facotory.Shape;

public class CircleFactory extends ShapeFactoryMethodFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
