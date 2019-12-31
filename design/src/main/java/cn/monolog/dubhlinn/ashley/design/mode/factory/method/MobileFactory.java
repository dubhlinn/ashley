package cn.monolog.dubhlinn.ashley.design.mode.factory.method;

/**
 * 工厂方法模式 —— 抽象工厂
 * @author dubhlinn
 * @date 2019-12-31
 */
public abstract class MobileFactory {

    /**
     * 生成手机实例
     * 由子类实现
     * @return
     */
    protected abstract Mobile productMobile();
}
