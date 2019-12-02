package cn.monolog.dubhlinn.ashley.algorithm.recursion;

import java.util.Scanner;

/**
 * Fibonacci数列实现
 * @author dubhlinn
 * @date 2019-12-02
 */
public class FibonacciArr {

    /**
     * 斐波那契函数
     * n=0时，结果为0
     * n=1时，结果为1
     * n>1时，结果为前两项之和
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }

    /**
     * 测试方法
     */
    public static void main(String[] args8) {
        System.out.println("请输出斐波那契数列的序号");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("斐波那契数列的第" + n + "项为" + result);
    }
}
