package com.example.observer.listener;

import com.example.behaviorMode.observer.customization.listener.AppListener;
import com.example.observer.event.ConfigDeleteEvent;

public class ConfigDeleteListener implements AppListener<ConfigDeleteEvent> {

    @Override
    public void onAppEvent(ConfigDeleteEvent event) {
        System.out.println("ConfigDeleteListener---" + Thread.currentThread().getName() + ",event=" + event);
    }
}
