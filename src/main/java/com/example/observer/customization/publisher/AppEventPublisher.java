package com.example.observer.customization.publisher;

import com.example.observer.customization.event.AppEvent;

public interface AppEventPublisher {

    void publishEvent(AppEvent event);

}
