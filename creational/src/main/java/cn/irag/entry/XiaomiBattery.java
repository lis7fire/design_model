package cn.irag.entry;

public class XiaomiBattery implements IBatteryProduct{
    @Override
    public void charge() {
        System.out.println("小米电池...充电");
    }

    @Override
    public void discharge() {
        System.out.println("小米电池...充满了");
    }

    @Override
    public void test() {
        System.out.println("小米电池...测试电池");
    }

    @Override
    public void repair() {
        System.out.println("小米电池...修理");
    }
}
