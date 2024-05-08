package com.example.observer.listener;

import com.example.observer.customization.listener.AppListener;
import com.example.observer.event.ConfigAddEvent;


public class ConfigAddListener implements AppListener<ConfigAddEvent> {
    @Override
    public void onAppEvent(ConfigAddEvent event) {
        System.out.println("ConfigAddListener----" + Thread.currentThread().getName() + ",event=" + event);
    }
}
