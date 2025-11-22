package cn.irag;

import cn.irag.entry.IBatteryProduct;
import cn.irag.abstractFactory.XiaomiAbstractFactory;
import cn.irag.entry.ICarProduct;
import cn.irag.factory.method.XiaomiFactory;
import cn.irag.factory.simple.CarSimpleFactory;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class CreationalMain {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.println("Hello and welcome!");

        // testFactory();
        testAbstractFactory();
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
}