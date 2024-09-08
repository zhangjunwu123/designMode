package com.example.结构组合模式七种.适配器模式;

public class JapanChargerImpl implements ChargerAdaptor{
    private ChinaChargerImpl chinaCharger;
    public JapanChargerImpl(ChinaChargerImpl chinaCharger) {
        this.chinaCharger = chinaCharger;
    }
    @Override
    public int printCharger() {
        return chinaCharger.printCharger() -50;
    }
}
