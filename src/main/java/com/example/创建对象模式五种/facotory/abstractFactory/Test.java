package com.example.创建对象模式五种.facotory.abstractFactory;

public class Test {

    public static void main(String[] args) {
        GUIFactory guiFactory = new WindowsGUIFactory();
        guiFactory.createButton().render();
        guiFactory.createTextField().render();
    }
}
