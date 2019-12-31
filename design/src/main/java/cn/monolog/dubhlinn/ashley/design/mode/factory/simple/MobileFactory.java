package cn.monolog.dubhlinn.ashley.design.mode.factory.simple;

/**
 * 简单工厂模式 —— 工厂类
 * @author dubhlinn
 * @date 2019-12-31
 */
public class MobileFactory {

    /**
     * 生成手机实例
     * @param make 手机品牌
     * @return
     */
    public static Mobile produceMobile(String make) throws Exception {
        //声明手机实例
        Mobile mobile;

        //根据客户端传入的品牌，创建不同的手机实例
        if ("huawei".equals(make)) {
            mobile = new HuaweiMobile(make);
        } else if ("mi".equals(make)) {
            mobile = new MiMobile(make);
        } else {
            throw new Exception("未知品牌");
        }

        //返回手机实例
        return mobile;
    }
}
