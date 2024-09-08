package com.example.创建对象模式五种.singleton;

/**
 * 饿汉：
 * 对象的创建时机，立即加载
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}


    public static HungrySingleton getInstance() {
        return instance;
    }

}
