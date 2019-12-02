package cn.monolog.dubhlinn.ashley.design.mode.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理的代理类生成器
 * @author dubhlinn
 * @date 2019-12-02
 */
public class CoderProxy implements MethodInterceptor {

    /**
     * 持有目标类实例
     */
    private Object target;

    /**
     * 由目标实例，生成代理实例
     * @param target
     * @return
     */
    public Object createProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("挤地铁...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("加班...");
        return result;
    }
}
