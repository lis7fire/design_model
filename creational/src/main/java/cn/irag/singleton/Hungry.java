package cn.irag.singleton;

import java.util.concurrent.*;

/**
 * 饿汉式，一上来就初始化，浪费性能，
 * @param
 * @return
 *
 * @author: LiBingYan
 * @时间:    2025/11/21
 */
public class Hungry {
    private static final Hungry instance = new Hungry();

    private Hungry(){}

    public static Hungry getInstance() {
        return instance;
    }

    // ====== 重要理解： 所有的单例，这里都是写这个单例对象的功能方法 public ，然后通过 EnumSingle.INSTANCE.doSomething(); 调佣 ========================================
    public void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println(String.format("当前线程id：%s；对象地址：%s,hashcode：%s",
                        Thread.currentThread().getId(), Hungry.getInstance(), Hungry.getInstance().hashCode()));
            });
        }
    }
}
