package cn.monolog.dubhlinn.ashley.se.arr;

import org.junit.Test;

/**
 * 验证数组的一些基本操作
 * @author dubhlinn
 * @date 2019-11-29
 */
public class Demo1 {

    /**
     * 基本类型数据数组的初始化
     * 初始化之后，元素默认为0
     */
    @Test
    public void test1() {
        //初始化一个整数数组
        int[] arr = new int[6];
        //获取数组内的元素
        System.out.println("第3个元素是：" + arr[2]);
        //获取数组外的元素，本行运行时异常，因为越界
        System.out.println("第10个元素是：" + arr[9]);
    }

    /**
     * 对象类型数据数组的初始化
     * 初始化之后，元素默认为null
     */
    @Test
    public void test2() {
        //初始化一个字符串数组
        String[] arr = new String[6];
        //获取数组内的元素
        System.out.println("第3个元素是：" + arr[2]);
        //获取数组外的元素，本行运行时异常，因为越界
        System.out.println("第10个元素是：" + arr[9]);
    }
}
