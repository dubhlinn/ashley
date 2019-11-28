package cn.monolog.dubhlinn.ashley.design.mode.proxy.motionless;

/**
 * 静态代理的目标类
 * @author dubhlinn
 * @date 2019-11-17
 */
public class Coder implements Worker {
    /**
     * 实现"工作"方法
     */
    public void work() {
        System.out.println("coding...");
    }
}
