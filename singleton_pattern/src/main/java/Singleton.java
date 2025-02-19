public class Singleton {

    /* Edition 1 : 多线程情况下，可能会实例化出多个对象

    private static Singleton uniqueInstance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

     */

    /* Edition 2 : 加锁保护，但存在性能问题

    private static Singleton uniqueInstance;

    private Singleton() { }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

     */

    /* Edition 3 : “急切”创建实例，优化了2，需考虑场景

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() { }

    public static synchronized Singleton getInstance() {
        return uniqueInstance;
    }

     */

    // Edition 4 : 双重加锁，减少同步使用

    private volatile static Singleton uniqueInstance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
