package com.example.创建对象模式五种.singleton;

/**
 * 懒汉：懒加载,调用getInstance的时候创建
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){}


    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}
