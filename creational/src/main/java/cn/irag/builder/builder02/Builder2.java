package cn.irag.builder.builder02;

// 升级版：通过 静态内部类 的方式实现零件无序装配构造，让用户当做 指挥者-Director
// 升级版的方法 能接收参数指令，有返回值，返回值是自己，
public class Builder2 extends AbstractBuilder2 {
    // 存放建造的的产品对象
    private Product2 product;

    public Builder2(){
        this.product = new Product2();
    }

    @Override
    public AbstractBuilder2 buildPartA(String msg) {
        product.setPartA(msg);
        return this;
    }

    @Override
    public AbstractBuilder2 buildPartB(String msg) {
        product.setPartB(msg);
        return this;
    }

    @Override
    public AbstractBuilder2 buildPartC(String msg) {
        product.setPartC(msg);
        return this;
    }

    @Override
    public Product2 getProduct() {
        return product;
    }

}
