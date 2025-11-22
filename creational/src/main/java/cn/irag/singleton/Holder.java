package cn.irag.singleton;

/**
 * 静态内部类【没啥用】
 * @param
 * @return
 *
 * @author: LiBingYan
 * @时间:    2025/11/21
 */
public class Holder {
    private Holder(){};
    public static Holder getInstance(){
        return HolderClass.INSTANCE;
    }
    private static class HolderClass{
        private static final Holder INSTANCE = new Holder();
    }

    // ====== 重要理解： 所有的单例，这里都是写这个单例对象的功能方法 public ，然后通过 EnumSingle.INSTANCE.doSomething(); 调佣 ========================================
    public void doSomething() {
        System.out.println("doSomething");
    }
}
