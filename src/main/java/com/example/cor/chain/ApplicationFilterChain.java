package com.example.cor.chain;

import com.example.cor.filter.Filter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class ApplicationFilterChain implements FilterChain{



    private static final int INCREMENT = 10;


    // target
    private Servlet servlet;

    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }

    // manage filters

    private Filter[] filters = new Filter[0];

    // filter count
    private int n;

    public void addFilter(Filter filter) {
        for (Filter f : filters) {
            if (f == filter) {
                return;
            }
        }

        // no capacity,
        if (n == filters.length) {
            Filter[] newFilters = new Filter[n + INCREMENT];
            System.arraycopy(this.filters,0,newFilters,0,n);
            filters = newFilters;
        }

        filters[n++] = filter;
    }

    // call next filter

    private int pos;// current filter index

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {

        if (pos < n) {
            // call next filter
            Filter filter = filters[pos++];
            filter.doFilter(request,response,this);
            return;
        }
        // call target
        servlet.service(request,response);
    }



}
