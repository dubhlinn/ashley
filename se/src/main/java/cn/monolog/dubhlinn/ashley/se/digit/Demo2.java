package cn.monolog.dubhlinn.ashley.se.digit;

import org.junit.Test;

/**
 * 验证Math类的一些静态方法
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Demo2 {

    /**
     * round方法——加0.5，然后向下取整
     */
    @Test
    public void test1() {
        float f1 = 1.4F;
        float f2 = 1.5F;
        float f3 = 1.6F;
        float f4 = -1.4F;
        float f5 = -1.5F;
        float f6 = -1.6F;
        System.out.println("1.4取整后：" + Math.round(f1));
        System.out.println("1.5取整后：" + Math.round(f2));
        System.out.println("1.6取整后：" + Math.round(f3));
        System.out.println("-1.4取整后：" + Math.round(f4));
        System.out.println("-1.5取整后：" + Math.round(f5));
        System.out.println("-1.6取整后：" + Math.round(f6));
    }

    /**
     * random方法——生成0到1之间的随机浮点数
     * 相当于Random类的nextDouble方法
     */
    @Test
    public void test2() {
        //生成随机浮点数
        double d = Math.random();
        //生成1-100之间的整数
        int i = (int) (Math.random() * 99 + 1);
        //打印
        System.out.println("随机浮点数：" + d);
        System.out.println("随机整数：" + i);
    }
}
