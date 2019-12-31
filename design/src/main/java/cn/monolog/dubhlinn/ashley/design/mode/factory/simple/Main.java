package cn.monolog.dubhlinn.ashley.design.mode.factory.simple;

/**
 * 工厂模式 —— 测试类
 * @author dubhlinn
 * @date 2019-12-31
 */
public class Main {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //通过工厂模式获取小米手机实例
        Mobile mi = MobileFactory.produceMobile("mi");
        System.out.println(mi.toString());

        //通过工厂模式获取iPhone实例
        Mobile iphone = MobileFactory.produceMobile("iphone");
        System.out.println(iphone.toString());
    }
}
