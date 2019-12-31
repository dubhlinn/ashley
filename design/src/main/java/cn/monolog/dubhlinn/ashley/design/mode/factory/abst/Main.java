package cn.monolog.dubhlinn.ashley.design.mode.factory.abst;

/**
 * 抽象工厂模式 —— 测试类
 * @author dubhlinn
 * @date 2019-12-31
 */
public class Main {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //获取小米手机实例
        ProductFactoryForMi productFactoryForMi = new ProductFactoryForMi();
        Mobile miMobile = productFactoryForMi.produceMobile();
        System.out.println(miMobile.toString());

        //获取华为电视实例
        ProductFactoryForHuawei productFactoryForHuawei = new ProductFactoryForHuawei();
        Television huaweiTelevision = productFactoryForHuawei.produceTelevision();
        System.out.println(huaweiTelevision.toString());
    }
}
