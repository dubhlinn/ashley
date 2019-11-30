package cn.monolog.dubhlinn.ashley.se.extend.constructor;

/**
 * 测试类
 * 用于验证类继承层次的构造方法调用顺序
 * 分析：在有继承层次的类中，如果新建一个子类实例
 * 1. 执行父类的静态代码块
 * 2. 执行子类的静态代码块
 * 3. 执行父类的构造方法
 * 4. 执行子类的构造方法
 * 如果再次新建一个子类实例，由于静态代码块只初始化一次，所以直接执行3、4两步
 * @author dubhlinn
 * @date 2019-11-30
 */
public class Main {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //新建Dog实例
        Animal dog = new Dog();
        //再次新建Dog实例
        Animal puppy = new Dog();
    }
}
