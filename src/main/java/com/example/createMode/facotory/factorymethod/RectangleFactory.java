package com.example.createMode.facotory.factorymethod;

import com.example.createMode.facotory.Rectangle;
import com.example.createMode.facotory.Shape;

public class RectangleFactory extends ShapeFactoryMethodFactory{
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
