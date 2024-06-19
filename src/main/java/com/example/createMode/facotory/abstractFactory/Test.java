package com.example.createMode.facotory.abstractFactory;

public class Test {

    public static void main(String[] args) {
        GUIFactory guiFactory = new WindowsGUIFactory();
        guiFactory.createButton().render();
        guiFactory.createTextField().render();
    }
}
