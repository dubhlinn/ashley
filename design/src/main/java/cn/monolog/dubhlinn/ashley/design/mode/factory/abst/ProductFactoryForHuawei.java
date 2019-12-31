package cn.monolog.dubhlinn.ashley.design.mode.factory.abst;

/**
 * 抽象工厂模式 —— 具体工厂之一
 * @author dubhlinn
 * @date 2019-12-31
 */
public class ProductFactoryForHuawei extends ProductFactory {

    /**
     * 生成华为手机实例
     * @return
     */
    @Override
    protected Mobile produceMobile() {
        return new HuaweiMobile("华为", "手机");
    }

    /**
     * 生成华为电视实例
     * @return
     */
    @Override
    protected Television produceTelevision() {
        return new HuaweiTelevision("华为", "电视");
    }
}
