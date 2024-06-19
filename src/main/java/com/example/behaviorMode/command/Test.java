package com.example.behaviorMode.command;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnCommand = new TurnOnComand(light);
        turnOnCommand.execute();

        Command turnOffCommand = new TurnOffCommand(light);
        turnOffCommand.execute();

    }
}
