package com.example.创建对象模式五种.facotory.simpleFactory;

import com.example.创建对象模式五种.facotory.Shape;
/**
 *  直接通过一个Factory类创建多个实体类的构造方式。
 * */
public class 简单工厂SimpleFactoryTest {

    public static void main(String[] args) {
        ShapeSimpleFactory shapeSimpleFactory = new ShapeSimpleFactory();
        Shape shape = shapeSimpleFactory.createShape("rectangle");
        shape.draw();
    }
}
