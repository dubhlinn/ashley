package cn.monolog.dubhlinn.ashley.algorithm.recursion;

import org.junit.Test;

/**
 * 用递归实现求和
 * @author dubhlinn
 * @date 2019-11-17
 */
public class RecursionSummation {

    /**
     * 数列求和
     * @param n 基数
     * @return 数列的和
     */
    public static long summation(int n) {
        //区分n是不是第一个
        if (n == 1) {
            return 1L;
        } else {
            return summation(n-1) + n;
        }
    }

    /**
     * 测试
     */
    @Test
    public void test() {
        //给定一个基数
        int n = 100;
        //递归方式数列求和
        long sum = summation(n);
        //打印结果
        System.out.println("1到" + n + "的和为:" + sum);
    }
}
