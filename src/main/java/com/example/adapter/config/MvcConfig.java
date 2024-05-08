package com.example.adapter.config;

import com.example.adapter.adapters.MyHandlerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

@Configuration
public class MvcConfig {

    @Bean
    public HandlerAdapter simpleServletHandlerAdapter() {
        return new SimpleServletHandlerAdapter();
    }

    @Bean
    public HandlerAdapter myHandlerAdapter() {
        return new MyHandlerAdapter();
    }
}
