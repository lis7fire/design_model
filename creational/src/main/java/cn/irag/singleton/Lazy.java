package cn.irag.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 进化1：懒汉式，使用时再创建对象
 * @param
 * @return
 *
 * @author: LiBingYan
 * @时间:    2025/11/21
 */
public class Lazy {
    private Lazy() { }
    private static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null) {
            // 这里多个线程同时进来会创建多个实例
            instance = new Lazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println(String.format("当前线程id：%s；对象地址：%s,hashcode：%s",
                        Thread.currentThread().getId(), Lazy.getInstance(), Lazy.getInstance().hashCode()));
            });
        }
    }
}
