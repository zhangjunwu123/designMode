package com.example.结构组合模式七种.适配器模式;

public class Test {

    public static void main(String[] args) {
        //当然这里可以根据不同的入参来决定生成哪个实现类，可以放入map，也可以从Spring中取出
        ChargerAdaptor japanCharger = new JapanChargerImpl(new ChinaChargerImpl());
        System.out.println(japanCharger.printCharger());
        System.out.println("==============================================");
        ChargerAdaptor usaCharger = new USAChargerImpl(new ChinaChargerImpl());
        System.out.println(usaCharger.printCharger());
    }
}
