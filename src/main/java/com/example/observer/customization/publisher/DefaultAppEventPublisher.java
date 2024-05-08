package com.example.observer.customization.publisher;

import com.example.observer.customization.event.AppEvent;
import com.example.observer.customization.multicaster.AppEventMulticaster;

public class DefaultAppEventPublisher implements AppEventPublisher{

    private AppEventMulticaster appEventMulticaster;

    public void setAppEventMulticaster (AppEventMulticaster appEventMulticaster) {
        this.appEventMulticaster = appEventMulticaster;
    }


    @Override
    public void publishEvent(AppEvent event) {
        appEventMulticaster.multicasterEvent(event);
    }
}
