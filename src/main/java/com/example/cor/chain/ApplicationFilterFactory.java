package com.example.cor.chain;

import com.example.cor.filter.Filter;

import javax.servlet.Servlet;

public class ApplicationFilterFactory {


    public static FilterChain createFilterChain(Servlet servlet, Filter ... filters) {
        if (servlet==null) {
            return null;
        }
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.setServlet(servlet);
        // add filters
        for (Filter filter : filters) {
            chain.addFilter(filter);
        }
        return chain;
    }
}
