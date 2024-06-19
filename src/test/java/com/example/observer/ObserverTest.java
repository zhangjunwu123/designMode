package com.example.observer;

import com.example.behaviorMode.observer.customization.multicaster.AppEventMulticaster;
import com.example.behaviorMode.observer.customization.multicaster.SimpleAppEventMulticaster;
import com.example.behaviorMode.observer.customization.publisher.DefaultAppEventPublisher;
import com.example.observer.entity.Config;
import com.example.observer.event.ConfigAddEvent;
import com.example.observer.event.ConfigDeleteEvent;
import com.example.observer.listener.ConfigAddListener;
import com.example.observer.listener.ConfigAddListener2;
import com.example.observer.listener.ConfigDeleteListener;

public class ObserverTest {

    public static void main(String[] args) {
        // multicaster
        AppEventMulticaster multicaster = new SimpleAppEventMulticaster();
        //add listener
        multicaster.addAppListener(new ConfigAddListener());
        multicaster.addAppListener(new ConfigAddListener2());
        multicaster.addAppListener(new ConfigDeleteListener());

        // publisher
        DefaultAppEventPublisher publisher = new DefaultAppEventPublisher();
        publisher.setAppEventMulticaster(multicaster);



        // publish event
        publisher.publishEvent(new ConfigAddEvent(new Config(12,"g1","n1","add1"),12));
        System.out.println("业务继续执行");
        publisher.publishEvent(new ConfigDeleteEvent(new Config(13,"g1","n1","del13")));
        System.out.println("finish");
    }
}
