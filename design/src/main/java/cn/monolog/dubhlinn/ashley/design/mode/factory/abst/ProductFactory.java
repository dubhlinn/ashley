package cn.monolog.dubhlinn.ashley.design.mode.factory.abst;

/**
 * 抽象工厂模式 —— 抽象工厂
 * @author dubhlinn
 * @date 2019-12-31
 */
public abstract class ProductFactory {

    /**
     * 生成手机产品
     * 由具体工厂子类实现
     * @return
     */
    protected abstract Mobile produceMobile();

    /**
     * 生成电视产品
     * 由具体工厂子类实现
     * @return
     */
    protected abstract Television produceTelevision();
}
