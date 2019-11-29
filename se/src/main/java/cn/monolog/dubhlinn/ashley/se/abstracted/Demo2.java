package cn.monolog.dubhlinn.ashley.se.abstracted;

import org.junit.Test;

/**
 * 验证抽象类及其自类的继承关系
 * @author dubhlinn
 * @date 2019-11-29
 */
public class Demo2 {

    /**
     * 测试方法
     */
    @Test
    public void test() {
        //新建一个Forger实例
        String profession = "forging";
        Worker forger = new Forger(profession);
        //调用非抽象方法
        forger.getSalary();
        //调用抽象方法
        forger.work();
        //获取实例的属性
        System.out.println(forger.getProfession());
    }
}
