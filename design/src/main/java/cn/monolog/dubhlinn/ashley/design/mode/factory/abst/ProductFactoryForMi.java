package cn.monolog.dubhlinn.ashley.design.mode.factory.abst;

/**
 * 抽象工厂模式 —— 具体工厂之一
 * @author dubhlinn
 * @date 2019-12-31
 */
public class ProductFactoryForMi extends ProductFactory {

    /**
     * 生成小米手机实例
     * @return
     */
    @Override
    protected Mobile produceMobile() {
        return new MiMobile("小米", "手机");
    }

    /**
     * 生成小米电视实例
     * @return
     */
    @Override
    protected Television produceTelevision() {
        return new MiTelevision("小米", "电视机");
    }
}
