package cn.monolog.dubhlinn.ashley.design.mode.single;

/**
 * 线程安全的单例模式
 * @author dubhlinn
 * @date 2019-11-28
 */
public class ThreadSafeSingleton {

    /*
     * 不直接实例化静态变量
     */
    private static ThreadSafeSingleton threadSafeSingleton = null;

    /**
     * 私有化构造方法
     */
    private ThreadSafeSingleton() {}

    /**
     * 获取唯一的实例
     * 加类锁
     * @return
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        //判断静态变量是否被初始化过，如果没有，则初始化
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        //返回
        return threadSafeSingleton;
    }
}
