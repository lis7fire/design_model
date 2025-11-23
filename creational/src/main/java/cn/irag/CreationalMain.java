package cn.irag;

import cn.irag.abstractFactory.XiaomiAbstractFactory;
import cn.irag.builder.builder01.Director;
import cn.irag.builder.builder01.Product;
import cn.irag.builder.builder01.Builder;
import cn.irag.builder.builder02.Product2;
import cn.irag.builder.builder02.Builder2;
import cn.irag.entry.IBatteryProduct;
import cn.irag.entry.ICarProduct;
import cn.irag.factory.method.XiaomiFactory;
import cn.irag.factory.simple.CarSimpleFactory;
import cn.irag.prototype.demo01.Video;
import lombok.SneakyThrows;

import java.time.LocalDateTime;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class CreationalMain {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.println("Hello and welcome!");

        // testFactory();
        // testAbstractFactory();
        testBuilder();
    }

    public static void testSingleton() {

    }

    public static void testFactory() {
        ICarProduct tesla = CarSimpleFactory.getCar("tesla");
        ICarProduct tesla2 = CarSimpleFactory.getCar("tesla");
        ICarProduct xiaomi = CarSimpleFactory.getCar("Xiaomi");
        tesla.run();
        System.out.println(tesla);
        System.out.println(tesla2);

        ICarProduct xm2 = new XiaomiFactory().getCar();
        xm2.run();
    }

    public static void testAbstractFactory() {
        System.out.println("抽象工厂模式");
        XiaomiAbstractFactory xiaomiFactory = new XiaomiAbstractFactory();
        ICarProduct xmCar = xiaomiFactory.getCar();
        xmCar.run();

        IBatteryProduct xmBattery = xiaomiFactory.getBattery();
        xmBattery.charge();
    }

    public static void testBuilder() {
        System.out.println("建造者模式");
        Director director = new Director();
        Product house = director.build(new Builder());
        System.out.println(house);
        System.out.println("-----------------  升级版：建造者模式 静态内部类  ----------------------");
        // 建造的工人
        Builder2 worker2 = new Builder2();
        // 链式编程
        Product2 product2 = worker2.buildPartA("partA").getProduct();
        System.out.println(product2);
    }

    @SneakyThrows
    public static void testPrototype() {
        System.out.println("原型模式");
        Video video = new Video("视频名称",LocalDateTime.now());

        Video video22 = (Video) video.clone();

        System.out.println(video22);
        System.out.println("-----------------  升级版：建造者模式 静态内部类  ----------------------");
        // 建造的工人
        Builder2 worker2 = new Builder2();
        // 链式编程
        Product2 product2 = worker2.buildPartA("partA").getProduct();
        System.out.println(product2);
    }

}