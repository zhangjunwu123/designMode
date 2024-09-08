package com.example.创建对象模式五种.facotory.simpleFactory;

import com.example.创建对象模式五种.facotory.Circle;
import com.example.创建对象模式五种.facotory.Rectangle;
import com.example.创建对象模式五种.facotory.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeSimpleFactory {
    private Map<String, Shape> map = new HashMap<>();
    public ShapeSimpleFactory(){
        map.put("circle", new Circle());
        map.put("rectangle", new Rectangle());
    }

    public Shape createShape(String shapeType){
        Shape shape = map.get(shapeType);
        if(shape == null){
            throw new RuntimeException("没有该形状");
        }
        return shape;
    }
}
