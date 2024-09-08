package com.example.对象行为模式十一种.command;

public class TurnOffCommand implements Command{
    private Light light;
    public TurnOffCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOff();
    }
}
