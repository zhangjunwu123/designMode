package com.example.cor.chain;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public interface FilterChain {

    void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException;
}
