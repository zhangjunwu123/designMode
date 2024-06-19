package com.example.behaviorMode.strategy;

public class AliPayStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付了 " + amount );
    }
}
