package cn.irag.abstractFactory;

import cn.irag.entry.IBatteryProduct;
import cn.irag.entry.ICarProduct;

// 抽象产品工厂：最顶层的接口，用来定义工厂的行为。具体的工厂类才去生成对象
public interface IProductFactory {
    // 【核心区别】抽象工厂有多个方法，可以制作多种类型对象，这些类型有相关性。

    // 生产汽车
    ICarProduct getCar();

    // 生产电池
    IBatteryProduct getBattery();
}
