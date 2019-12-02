package cn.monolog.dubhlinn.ashley.design.mode.proxy.jdk;

/**
 * JDK动态代理中的目标类
 * @author dubhlinn
 * @date 2019-12-01
 */
public class Coder implements Worker {
    @Override
    public void work() {
        System.out.println("coding...");
    }
}
