package com.example.adapter.handler;

import org.springframework.stereotype.Controller;

import javax.servlet.*;
import java.io.IOException;

@Controller("/test4")
public class Handler4 implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("implements Servlet handler");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
