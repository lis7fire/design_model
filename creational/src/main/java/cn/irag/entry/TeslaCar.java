package cn.irag.entry;

public class TeslaCar implements ICarProduct {
    @Override
    public void name() {
        System.out.println("特斯拉");
    }

    @Override
    public void start() {
        System.out.println("特斯拉...启动");
    }

    @Override
    public void run() {
        System.out.println("特斯拉...加速跑");
    }

    @Override
    public void stop() {
        System.out.println("特斯拉...刹车");
    }
}
