package cn.monolog.dubhlinn.ashley.se.extend.constructor;

/**
 * 父类
 * 用于验证类继承层次的构造方法调用顺序
 * @author dubhlinn
 * @date 2019-11-30
 */
public class Animal {

    /**
     * 静态代码块
     */
    static {
        System.out.println("来自Animal类的静态代码块");
    }

    /**
     * 静态方法
     */
    public static void animal() {
        System.out.println("来自Animal类的静态方法");
    }

    /**
     * 构造方法
     */
    public Animal() {
        System.out.println("来自Animal类的构造方法");
    }
}
