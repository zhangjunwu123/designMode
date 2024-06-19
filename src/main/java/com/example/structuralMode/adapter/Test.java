package com.example.structuralMode.adapter;

public class Test {

    public static void main(String[] args) {
        MyAdapter myAdapter = new MyAdapter(new TrdHandler());
        System.out.println(myAdapter.getArea());
    }
}
