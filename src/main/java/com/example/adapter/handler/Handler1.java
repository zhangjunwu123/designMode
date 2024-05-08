package com.example.adapter.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler1 {

    @RequestMapping("/test1")
    public String test() {
        return "RequestMapping handler";
    }
}
