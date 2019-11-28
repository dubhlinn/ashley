package cn.monolog.dubhlinn.ashley.design.mode.proxy.motionless;

import org.junit.Test;

/**
 * 静态代理的测试类
 * @author dubhlinn
 * @date 2019-11-19
 */
public class Main {

    /**
     * 测试方法
     */
    @Test
    public void test() {
        //新建目标类实例
        Worker coder = new Coder();
        //新建代理类实例
        CoderProxy coderProxy = new CoderProxy(coder);
        //执行代理方法
        coderProxy.work();
    }
}
