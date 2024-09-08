package com.example.结构组合模式七种.facade;

public class ComputorFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputorFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("计算机启动开始");
        cpu.start();
        memory.start();
        hardDrive.start();
        System.out.println("计算机启动完成");
    }

    public void shutdown() {
        System.out.println("计算机关闭开始");
        cpu.shutdown();
        memory.shutdown();
        hardDrive.shutdown();
        System.out.println("计算机关闭完成");
    }
}
