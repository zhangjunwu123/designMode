package com.example.createMode.facotory.factorymethod;

import com.example.createMode.facotory.Circle;
import com.example.createMode.facotory.Shape;

public class CircleFactory extends ShapeFactoryMethodFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
