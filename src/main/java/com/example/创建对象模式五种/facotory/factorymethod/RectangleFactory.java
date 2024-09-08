package com.example.创建对象模式五种.facotory.factorymethod;

import com.example.创建对象模式五种.facotory.Rectangle;
import com.example.创建对象模式五种.facotory.Shape;

public class RectangleFactory extends ShapeFactoryMethodFactory{
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
