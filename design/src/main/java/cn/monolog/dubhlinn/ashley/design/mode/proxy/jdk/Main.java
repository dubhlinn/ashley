package cn.monolog.dubhlinn.ashley.design.mode.proxy.jdk;

/**
 * JDK动态代理测试类
 * @author dubhlinn
 * @date 2019-12-01
 */
public class Main {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //新建目标实例
        Coder coder = new Coder();
        //新建代理实例
        Worker proxy = (Worker) new WorkerProxy().createProxy(coder);
        //调用目标方法
        proxy.work();
    }
}
