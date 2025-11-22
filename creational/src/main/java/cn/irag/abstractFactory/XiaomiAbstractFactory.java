package cn.irag.abstractFactory;

import cn.irag.entry.IBatteryProduct;
import cn.irag.entry.ICarProduct;
import cn.irag.entry.XiaomiBattery;
import cn.irag.entry.XiaomiCar;

// 实现具体的工厂功能，以便生成对象
public class XiaomiAbstractFactory implements IProductFactory{
    @Override
    public ICarProduct getCar() {
        return new XiaomiCar();
    }

    @Override
    public IBatteryProduct getBattery() {
        return new XiaomiBattery();
    }
}
