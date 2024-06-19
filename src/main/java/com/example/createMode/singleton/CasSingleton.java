package com.example.createMode.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class CasSingleton {
    private static final AtomicReference<CasSingleton> instance = new AtomicReference<>();

    private CasSingleton(){}

    public static CasSingleton getInstance() {
        while (instance.get() == null) {
            instance.compareAndSet(null,new CasSingleton());
        }
        return instance.get();
    }


    public static void main(String[] args) {
        Thread[] threads = new Thread[1000];
        CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(()->{
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                CasSingleton instance = CasSingleton.getInstance();
                System.out.println(instance);
            }, i+"");
            threads[i].start();
            latch.countDown();
        }
        try {
            latch.await();
            System.out.println("finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
