package cn.monolog.dubhlinn.ashley.design.mode.factory.method;

/**
 * 工厂方法模式 —— 测试类
 * @author dubhlinn
 * @date 2019-12-31
 */
public class Main {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //先新建具体工厂的实例
        MobileFactoryForMi mobileFactoryForMi = new MobileFactoryForMi();
        //在获取小米实例
        Mobile miMobile = mobileFactoryForMi.productMobile();
        //输出
        System.out.println(miMobile.toString());
    }
}
