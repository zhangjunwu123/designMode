package com.example.adapter.handler;

import com.example.adapter.inf.MyController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("/test5")
public class Handler5 implements MyController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().println("implements MyController handler");
        return null;
    }
}
