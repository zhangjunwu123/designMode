package com.example.对象行为模式十一种.command;

public class TurnOnComand  implements Command{
    private Light light;
    public TurnOnComand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
