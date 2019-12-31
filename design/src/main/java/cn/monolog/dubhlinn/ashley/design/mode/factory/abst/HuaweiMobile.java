package cn.monolog.dubhlinn.ashley.design.mode.factory.abst;

/**
 * 抽象工厂模式 —— 具体产品之一
 * @author dubhlinn
 * @date 2019-12-31
 */
public class HuaweiMobile implements Mobile {
    /*
     * 品牌
     */
    private String make;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 构造方法
     * @param make
     * @param name
     */
    public HuaweiMobile(String make, String name) {
        this.make = make;
        this.name = name;
    }

    /**
     * 重写转字符串的方法
     * @return
     */
    @Override
    public String toString() {
        return "MiMobile{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
