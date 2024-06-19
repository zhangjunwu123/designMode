package com.example.structuralMode.proxy;

public class Test {

    public static void main(String[] args) {
        Image image = new ImageProxy("zhangsan.txt");
        image.display();
    }
}
