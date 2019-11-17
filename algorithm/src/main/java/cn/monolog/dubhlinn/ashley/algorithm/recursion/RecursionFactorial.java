package cn.monolog.dubhlinn.ashley.algorithm.recursion;

import org.junit.Test;

/**
 * 用递归实现阶乘
 * @author dubhlinn
 * @date 2019-11-17
 */
public class RecursionFactorial {
    /**
     * 阶乘
     * @param n 基数
     * @return 阶乘积
     */
    public static long factorial(int n) {
        //声明积
        long product = 1L;

        //区分基数是不是1
        if (n == 1) {
            return product;
        } else {
            return factorial(n-1) * n;
        }
    }

    /**
     * 测试
     */
    @Test
    public void test() {
        //给定一个基数
        int n = 18;
        //求阶乘
        long product = factorial(n);
        //打印结果
        System.out.println(n + "的阶乘为：" + product);
    }
}
