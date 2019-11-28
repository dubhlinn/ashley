package cn.monolog.dubhlinn.ashley.design.mode.single;

/**
 * 饥饿模式的单例模式
 * @author dubhlinn
 * @date 2019-11-28
 */
public class EagerSingleton {

    /*
     * 直接实例化静态变量
     */
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    /**
     * 私有化构造方法
     */
    private EagerSingleton() {}

    /**
     * 获取唯一实例
     * @return
     */
    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
