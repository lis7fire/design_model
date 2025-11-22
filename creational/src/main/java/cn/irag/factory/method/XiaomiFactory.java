package cn.irag.factory.method;

import cn.irag.entry.ICarProduct;
import cn.irag.entry.XiaomiCar;

public class XiaomiFactory implements CarFactory{
    @Override
    public ICarProduct getCar() {
        return new XiaomiCar();
    }
}
