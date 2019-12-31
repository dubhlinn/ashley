package cn.monolog.dubhlinn.ashley.design.mode.factory.method;

/**
 * 工厂方法模式 —— 具体工厂
 * @author dubhlinn
 * @date 2019-12-31
 */
public class MobileFactoryForHuawei extends MobileFactory {

    /**
     * 生成华为手机实例
     * @return
     */
    @Override
    public Mobile productMobile() {
        HuaweiMobile huaweiMobile = new HuaweiMobile("huawei");
        return huaweiMobile;
    }
}
