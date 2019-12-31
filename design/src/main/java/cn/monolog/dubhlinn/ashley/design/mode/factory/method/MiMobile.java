package cn.monolog.dubhlinn.ashley.design.mode.factory.method;

/**
 * 工厂方法模式 —— 实体类
 * @author dubhlinn
 * @date 2019-12-31
 */
public class MiMobile implements Mobile {
    /*
     * 品牌
     */
    private String make;

    /**
     * 构造方法
     * @param make
     */
    public MiMobile(String make) {
        this.make = make;
    }

    /**
     * 重写转字符串的方法
     * @return
     */
    @Override
    public String toString() {
        return "MiMobile{" +
                "make='" + make + '\'' +
                '}';
    }
}
