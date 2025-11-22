package cn.irag.factory.method;

import cn.irag.entry.ICarProduct;

/**
 * 工厂方法模式,最顶层的工厂接口。用每个车都要实现自己的工厂
 *
 * @param
 * @return
 *
 * @author: LiBingYan
 * @时间:    2025/11/22
 */
public interface CarFactory {
    // 【核心区别】工厂方法只有一个方法。是为了灵活创建【单个类型】的对象
    // 如果这里是多个方法就是：抽象工厂。是为了保证产品家族的兼容性【一批相关类型的对象】。
    ICarProduct getCar();
}
