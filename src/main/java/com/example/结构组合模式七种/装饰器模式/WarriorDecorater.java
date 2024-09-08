package com.example.结构组合模式七种.装饰器模式;
/**
 * 装饰器模板
 * 加载原有warrior，执行的也是原有warrior的动作
 * */
public class WarriorDecorater implements Warrior{
    private Warrior warrior;
    public WarriorDecorater(Warrior warrior) {
        this.warrior = warrior;
    }
    @Override
    public void fight() {
        this.warrior.fight();
    }
}
