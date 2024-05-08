package com.example.observer.spring.event;

import org.springframework.context.ApplicationEvent;

public class ServiceModifyEvent extends ApplicationEvent {

    private final long timestamp;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public ServiceModifyEvent(Object source,long timestamp) {
        super(source);
        this.timestamp = timestamp;
    }
}
