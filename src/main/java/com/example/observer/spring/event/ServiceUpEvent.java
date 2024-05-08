package com.example.observer.spring.event;

import org.springframework.context.ApplicationEvent;

public class ServiceUpEvent extends ApplicationEvent {

    private final Integer id;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public ServiceUpEvent(Object source,Integer serviceId) {
        super(source);
        this.id = serviceId;
    }
}
