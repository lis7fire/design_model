package cn.irag.builder.builder01;

// 【核心】指挥者，编排制作流程、指挥建造者具体干活，返回产品。【一般使用者就是这个指挥者】
public class Director {

    //指挥【建造者】【按照规定顺序】制作产品
    public Product build(Builder builder){
        builder.buildPartB();
        builder.buildPartA();
        builder.buildPartC();

        return builder.getProduct();
    }
}
