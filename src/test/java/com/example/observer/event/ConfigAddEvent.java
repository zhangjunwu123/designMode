package com.example.observer.event;

import com.example.behaviorMode.observer.customization.event.AppEvent;

public class ConfigAddEvent extends AppEvent {
    private Integer id;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ConfigAddEvent(Object source,Integer id) {
        super(source);
        this.id = id;
    }
}
