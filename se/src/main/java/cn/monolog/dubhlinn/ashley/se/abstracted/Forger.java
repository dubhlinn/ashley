package cn.monolog.dubhlinn.ashley.se.abstracted;

/**
 * 继承自抽象类的普通类
 * @author dubhlinn
 * @date
 */
public class Forger extends Worker {

    /**
     * 构造方法
     * 子类不能直接继承父类的构造方法，但是可以通过super关键字调用
     * @param profession
     */
    public Forger(String profession) {
        super(profession);
    }

    /**
     * 继承抽象类，必须实现抽象方法
     */
    @Override
    public void work() {
        System.out.println("锻造");
    }
}
