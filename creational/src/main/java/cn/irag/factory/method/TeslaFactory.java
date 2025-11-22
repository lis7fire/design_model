package cn.irag.factory.method;

import cn.irag.entry.ICarProduct;
import cn.irag.entry.TeslaCar;

public class TeslaFactory implements CarFactory{

    @Override
    public ICarProduct getCar() {
        return new TeslaCar();
    }
}
