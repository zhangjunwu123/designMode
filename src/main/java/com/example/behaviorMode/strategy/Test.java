package com.example.behaviorMode.strategy;

public class Test {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new WechatPayStrategy());
        cart.pay(3d);

    }
}
