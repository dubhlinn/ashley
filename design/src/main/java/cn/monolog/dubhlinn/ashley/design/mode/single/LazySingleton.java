package cn.monolog.dubhlinn.ashley.design.mode.single;

/**
 * 懒加载模式的单例模式
 * @author dubhlinn
 * @date 2019-11-28
 */
public class LazySingleton {

    /*
     * 不直接实例化静态变量
     */
    private static LazySingleton lazySingleton = null;

    /**
     * 私有化构造方法
     */
    private LazySingleton() {}

    /**
     * 获取唯一实例
     * @return
     */
    public static LazySingleton getInstance() {
        //判断静态变量是否被实例化过，如果没有，则实例化
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        //返回
        return lazySingleton;
    }
}
