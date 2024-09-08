package com.example.创建对象模式五种.singleton;
/**
 * DCL双重校验
 * */
public class DclSingleton {

    /**
     * Volatile 可见，且防止指令重排
     * */
    private static volatile DclSingleton instance = null;


    private DclSingleton(){}

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

}
