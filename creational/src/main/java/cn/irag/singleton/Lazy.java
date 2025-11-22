package cn.irag.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 进化1：懒汉式，使用时再创建对象。
 * 也叫双重检查锁【最推荐】
 * 但是都无法避免反射绕过。
 * @param
 * @return
 *
 * @author: LiBingYan
 * @时间:    2025/11/21
 */
public class Lazy {
    private Lazy() { }
    private volatile static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null) {
            // 这里多个线程同时进来会创建多个实例
            synchronized (Lazy.class){
                // 解决多线程突出问题：就是加锁，保证只有一个线程进来，然后再检查一次。
                if (instance == null) {
                    // 因为下面这句【不是原子操作】极端情况下，也会因为指令重排导致创建多个实例，要加上  volatile
                    instance = new Lazy();
                    /* 上面这句实际是3步，可能指令重排导致问题：
                    * 1. 分配内存给这个对象
                    * 2. 初始化对象
                    * 3. 设置 instance栈变量 指向刚分配的内存
                    * */
                }
            }
        }
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
                        Thread.currentThread().getId(), Lazy.getInstance(), Lazy.getInstance().hashCode()));
            });
        }
    }

    // 反射绕过 单例模式 然后创建对象的例子
    private  void reflect() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Lazy> declaredConstructor = Lazy.class.getDeclaredConstructor();
        // 将访问权限设为 true，就能无视private。
        declaredConstructor.setAccessible(true);
        // 这样就创建了一个单例之外的对象
        Lazy instance1 = declaredConstructor.newInstance();
    }
}
