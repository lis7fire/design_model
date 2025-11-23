package cn.irag.builder.builder01;

// 一个建造者，拥有多种生成组件的技能，最终可以返回一个完整成品。
public class Builder extends AbstractBuilder {
    private Product product;

    public Builder(){
        product = new Product();
    }

    @Override
    void buildPartA() {
        product.setPartA("组件A");
        System.out.println("制造组件...A");
    }

    @Override
    void buildPartB() {
        product.setPartB("组件B");
        System.out.println("制造组件...B");
    }

    @Override
    void buildPartC() {
        product.setPartC("组件C");
        System.out.println("制造组件...C");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
