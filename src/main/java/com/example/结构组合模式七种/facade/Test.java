package com.example.结构组合模式七种.facade;

public class Test {

    public static void main(String[] args) {
        ComputorFacade facade = new ComputorFacade();
        facade.start();

        facade.shutdown();
    }
}
