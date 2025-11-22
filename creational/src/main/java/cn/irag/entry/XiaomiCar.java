package cn.irag.entry;

public class XiaomiCar implements ICarProduct {
    @Override
    public void name() {
        System.out.println("小米汽车");
    }

    @Override
    public void start() {
        System.out.println("小米汽车...启动");
    }

    @Override
    public void run() {
        System.out.println("小米汽车...加速跑");
    }

    @Override
    public void stop() {
        System.out.println("小米汽车...刹车");
    }
}
