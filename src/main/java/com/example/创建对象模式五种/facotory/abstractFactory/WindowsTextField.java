package com.example.创建对象模式五种.facotory.abstractFactory;

public class WindowsTextField  implements TextField{
    @Override
    public void render() {
        System.out.println("render windows textField");
    }
}
