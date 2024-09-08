package com.example.结构组合模式七种.适配器模式;
/**
 * 这是我们原来的系统输出
 * 现在我们要推广世界，发现世界各地的输出电压不一致，不兼容外部
 * */
public class ChinaChargerImpl implements IChinaCharger{
    @Override
    public int printCharger() {
        return 220;
    }
}
