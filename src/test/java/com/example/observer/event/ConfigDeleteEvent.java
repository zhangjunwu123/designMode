package com.example.observer.event;

import com.example.behaviorMode.observer.customization.event.AppEvent;

public class ConfigDeleteEvent extends AppEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ConfigDeleteEvent(Object source) {
        super(source);
    }
}
