package com.example.结构组合模式七种.适配器模式;

public class USAChargerImpl implements ChargerAdaptor{
    private ChinaChargerImpl chinaCharger;
    public USAChargerImpl(ChinaChargerImpl chinaCharger) {
        this.chinaCharger = chinaCharger;
    }

    @Override
    public int printCharger() {
        return (chinaCharger.printCharger() -110);
    }
}
