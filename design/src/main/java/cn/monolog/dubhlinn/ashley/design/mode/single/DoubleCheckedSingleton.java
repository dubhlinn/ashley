package cn.monolog.dubhlinn.ashley.design.mode.single;

/**
 * 性能优化版的线程安全单例模式
 * @author dubhlinn
 * @date 2019-11-28
 */
public class DoubleCheckedSingleton {
    /*
     * 不直接实例化静态变量
     */
    private static DoubleCheckedSingleton doubleCheckedSingleton = null;

    /**
     * 私有化构造方法
     */
    private DoubleCheckedSingleton() {}

    /**
     * 获取唯一实例
     * 由于线程不安全发生在实例化这一步，因此只在把实例化这一部分加类锁
     * @return
     */
    public static DoubleCheckedSingleton getInstance() {
        //判断静态变量是否被初始化过，如果没有，则初始化
        if (doubleCheckedSingleton == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (doubleCheckedSingleton == null) {
                    doubleCheckedSingleton = new DoubleCheckedSingleton();
                }
            }
        }
        //返回
        return doubleCheckedSingleton;
    }
}
