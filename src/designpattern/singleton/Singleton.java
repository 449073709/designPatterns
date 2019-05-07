package designpattern.singleton;

/**
 * 单例类
 */
public class Singleton {

}

/**
 * 饱汉式，存在线程不安全的问题
 */
class FullSingleton {

    private static FullSingleton instance;

    //私有化构造器
    private FullSingleton() {

    }

    public static FullSingleton getInstance() {
        if (instance == null) {
            instance = new FullSingleton();
        }
        return instance;
    }

}

/**
 * 饿汉式，线程安全（不存在同步问题，但是类被加载即被初始化，特定条件下耗费内存）
 */
class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    //私有化构造器
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}

/**
 * 线程安全的写法，单例模式最优写法
 */
class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    //私有化构造器
    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

}