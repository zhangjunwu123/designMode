package com.example.cor;

import com.example.cor.chain.ApplicationFilterFactory;
import com.example.cor.chain.FilterChain;
import com.example.cor.filters.AuthFilter;
import com.example.cor.filters.CostFilter;

import javax.servlet.*;
import java.io.IOException;

public class CorTest {
    public static void main(String[] args) {
        FilterChain chain = ApplicationFilterFactory.createFilterChain(new Servlet() {
            @Override
            public void init(ServletConfig config) throws ServletException {

            }

            @Override
            public ServletConfig getServletConfig() {
                return null;
            }

            @Override
            public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
                System.out.println("myservlet service...........");
            }

            @Override
            public String getServletInfo() {
                return null;
            }

            @Override
            public void destroy() {

            }
        }, new AuthFilter(), new CostFilter());

        // req,res

        try {
            chain.doFilter(null,null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
