package com.example.adapter.inf;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MyController {

    ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
