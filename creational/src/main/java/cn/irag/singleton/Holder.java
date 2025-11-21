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
}
