package cn.monolog.dubhlinn.ashley.se.equals;

import org.junit.Test;

/**
 * 验证Integer的==
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Demo1 {

    /**
     * 测试方法
     * Integer的==
     * 结论：如果是new出来的对象，肯定是要比较在堆中的地址
     * 如果是把一个数字直接赋给Integer引用，会调用Integer.valueOf方法
     * 如果这个数字介于-128~127之间，会直接从缓存中取值，那么比较的就是静态值
     * 否则，会new一个对象，比较的还是堆中的地址
     */
    @Test
    public void test() {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = new Integer(100);
        Integer i4 = 200;
        Integer i5 = 200;
        Integer i6 = null;
        System.out.println("i1==i2 ? " + (i1==i2));
        System.out.println("i1==i3 ? " + (i1==i3));
        System.out.println("i4==i5 ? " + (i4==i5));
        System.out.println("i4 equals i5 ? " + (i4.equals(i5)));
        System.out.println("i6==i1 ? " + (i6==i1));
    }
}
