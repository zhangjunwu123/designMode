package com.example.对象行为模式十一种.strategy;

public class WechatPayStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("使用了微信支付了 " + amount);
    }
}
