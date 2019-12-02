package cn.monolog.dubhlinn.ashley.design.mode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理中的代理生成器
 * @author dubhlinn
 * @date 2019-12-01
 */
public class WorkerProxy implements InvocationHandler {
    /*
     * 持有代理类实例
     */
    private Object target;

    /**
     * 接收目标类实例，生成代理类实例
     * @param target
     * @return
     */
    public Object createProxy(Object target) {
        this.target = target;
        Object proxy = Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(),
                this);
        return proxy;
    }

    /**
     * 用反射方式执行方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置增强
        System.out.println("挤地铁...");
        //调用目标方法
        Object result = method.invoke(this.target, args);
        //后置增强
        System.out.println("加班...");
        //返回
        return result;
    }
}
