package com.example.singleton;

public class DclSingleton {

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
