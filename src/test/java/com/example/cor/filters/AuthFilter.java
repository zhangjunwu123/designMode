package com.example.cor.filters;


import com.example.cor.chain.FilterChain;
import com.example.cor.filter.Filter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AuthFilter pre");
        chain.doFilter(request,response);
        System.out.println("AuthFilter post");
    }

}
