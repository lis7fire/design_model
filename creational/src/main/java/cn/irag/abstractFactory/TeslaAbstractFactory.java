package cn.irag.abstractFactory;

import cn.irag.entry.IBatteryProduct;
import cn.irag.entry.ICarProduct;
import cn.irag.entry.TeslaBattery;
import cn.irag.entry.TeslaCar;

public class TeslaAbstractFactory implements IProductFactory{
    @Override
    public ICarProduct getCar() {
        return new TeslaCar();
    }

    @Override
    public IBatteryProduct getBattery() {
        return new TeslaBattery();
    }
}
