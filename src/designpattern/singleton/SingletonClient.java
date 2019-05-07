package designpattern.singleton;

/**
 * 单例模式
 */
public class SingletonClient {

    public static void main(String[] args) {
        //饱汉式，存在线程不安全的问题
        FullSingleton instance1 = FullSingleton.getInstance();
        FullSingleton instance2 = FullSingleton.getInstance();
        System.out.println("是否是单例：" + (instance1 == instance2));

        //饿汉式，线程安全（不存在同步问题，但是类被加载即被初始化，特定条件下耗费内存）
        HungrySingleton instance3 = HungrySingleton.getInstance();
        HungrySingleton instance4 = HungrySingleton.getInstance();
        System.out.println("是否是单例：" + (instance3 == instance4));

        //线程安全的写法，单例模式最优写法
        ThreadSafeSingleton instance5 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance6 = ThreadSafeSingleton.getInstance();
        System.out.println("是否是单例：" + (instance5 == instance6));
    }

}