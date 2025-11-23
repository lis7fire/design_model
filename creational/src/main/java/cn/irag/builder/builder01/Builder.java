package cn.irag.builder.builder01;

// 抽象的建造者：抽象的建造方法，就是功能
public abstract class Builder {

    // 建造过程分为3个步骤创建产品对象。
    abstract void buildPartA();

    abstract void buildPartB();

    abstract void buildPartC();

    // 建造完成，返回完整产品对象
    abstract Product getProduct();
}
