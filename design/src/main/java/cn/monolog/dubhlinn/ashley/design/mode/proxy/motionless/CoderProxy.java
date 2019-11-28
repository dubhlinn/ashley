package cn.monolog.dubhlinn.ashley.design.mode.proxy.motionless;

/**
 * 静态代理的代理类
 * @author dubhlinn
 * @date 2019-11-17
 */
public class CoderProxy implements Worker {
    /**
     * 持有目标类的实例
     */
    private Worker target;

    /**
     * 构造方法
     * @param target
     */
    public CoderProxy(Worker target) {
        this.target = target;
    }

    /**
     * 实现"工作"方法
     */
    public void work() {
        //前置增强
        System.out.println("挤地铁...");
        //执行目标方法
        System.out.println("coding...");
        //后置增强
        System.out.println("开会...");
    }
}
