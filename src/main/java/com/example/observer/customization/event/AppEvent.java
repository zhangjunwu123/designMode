package com.example.observer.customization.event;

import java.util.EventObject;

/**
 * 事件的抽象
 */
public abstract class AppEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public AppEvent(Object source) {
        super(source);
    }
}
