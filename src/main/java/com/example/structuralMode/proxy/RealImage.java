package com.example.structuralMode.proxy;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("从磁盘加载图像：" + filename);
    }

    @Override
    public void display() {
        System.out.println("显示图像：" + filename);
    }
}
