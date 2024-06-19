package com.example.structuralMode.adapter;
/**
 * 适配器，用于转换
 * */
public class MyAdapter {
    private TrdHandler trdHandler;

    public MyAdapter(TrdHandler trdHandler){
        this.trdHandler = trdHandler;
    }

    public Double getArea(){
        return trdHandler.calcArea();
    }
}
