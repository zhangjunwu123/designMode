package com.example.behaviorMode.command;

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
