package cn.monolog.dubhlinn.ashley.design.mode.proxy.cglib;


/**
 * cglib动态代理的测试类
 * @author dubhlinn
 * @date 2019-12-02
 */
public class Main {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //新建目标实例
        Coder coder = new Coder();
        //生成代理实例
        Coder proxy = (Coder) new CoderProxy().createProxy(coder);
        //用代理实例调用目标方法
        proxy.work();
    }
}
