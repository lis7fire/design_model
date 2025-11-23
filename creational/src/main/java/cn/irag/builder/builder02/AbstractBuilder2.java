package cn.irag.builder.builder02;

public abstract class AbstractBuilder2 {

    // 建造过程分为3个步骤创建产品对象。
    public abstract AbstractBuilder2 buildPartA(String msg);

    public abstract AbstractBuilder2 buildPartB(String msg);

    public abstract AbstractBuilder2 buildPartC(String msg);

    // 建造完成，返回完整产品对象
    public abstract Product2 getProduct();
}
