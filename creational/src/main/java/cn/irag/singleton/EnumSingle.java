package cn.irag.singleton;

/**
 * 【终极版】枚举单例；    反射都无法破坏
 *
 * @param
 * @return
 * @author: LiBingYan
 * @时间: 2025/11/21
 */
public enum EnumSingle {
    // 枚举本身也是一个class类【编译后的代码就是】。
    // 下面这个叫枚举常量；所有枚举常量天然就是“全局唯一实例”
    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }

}
