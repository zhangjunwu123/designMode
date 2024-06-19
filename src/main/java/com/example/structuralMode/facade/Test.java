package com.example.structuralMode.facade;

public class Test {

    public static void main(String[] args) {
        ComputorFacade facade = new ComputorFacade();
        facade.start();

        facade.shutdown();
    }
}
