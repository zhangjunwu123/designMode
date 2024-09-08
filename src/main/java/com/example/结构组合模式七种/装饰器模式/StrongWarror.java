package com.example.结构组合模式七种.装饰器模式;

public class StrongWarror extends WarriorDecorater {
    public StrongWarror(Warrior warrior) {
        super(warrior);
    }

    @Override
    public void fight() {
        super.fight();
        System.out.println("我是Strong warrior");
    }
}
