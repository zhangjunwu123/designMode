package com.example.createMode.facotory.simpleFactory;

import com.example.createMode.facotory.Circle;
import com.example.createMode.facotory.Rectangle;
import com.example.createMode.facotory.Shape;

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
