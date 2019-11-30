package cn.monolog.dubhlinn.ashley.se.extend.constructor;

/**
 * 子类
 * 用于验证类继承层次的构造方法调用顺序
 * @author dubhlinn
 * @date 2019-11-30
 */
public class Dog extends Animal {

    /**
     * 静态代码块
     */
    static {
        System.out.println("来自Dog类的静态代码块");
    }

    /**
     * 静态方法
     */
    public static void dog() {
        System.out.println("来自Dog类的静态方法");
    }

    /**
     * 构造方法
     */
    public Dog() {
        System.out.println("来自Dog类的构造方法");
    }
}
