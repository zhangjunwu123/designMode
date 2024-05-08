package com.example.observer.spring.controller;

import com.example.observer.spring.entity.Service;
import com.example.observer.spring.event.ServiceModifyEvent;
import com.example.observer.spring.event.ServiceUpEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {


    @GetMapping("/up")
    public Service up() {
        Service service = new Service(1,"orderservice","service up");

        return service;
    }

    @GetMapping("/modify")
    public Service modify() {
        Service service = new Service(1,"orderservice","service modify");

        return service;
    }
}
