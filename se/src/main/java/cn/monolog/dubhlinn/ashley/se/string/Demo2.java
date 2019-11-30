package cn.monolog.dubhlinn.ashley.se.string;

import org.junit.Test;

/**
 * 实现字符串反转
 * @author dubhlinn
 * @date 2019-11-30
 */
public class Demo2 {

    /**
     * 利用StringBuilder的JDK方法实现反转
     * @param source 反转前的字符串
     * @return 反转后的字符串
     */
    public static String reverse1(String source) {
        //新建字符串构建器实例
        StringBuilder stringBuilder = new StringBuilder(source);
        //反转
        stringBuilder.reverse();
        //返回
        return stringBuilder.toString();
    }

    /**
     * 利用字符串的指定位置字符实现反转
     * @param source 反转前的字符串
     * @return 反转后的字符串
     */
    public static String reverse2(String source) {
        //声明空的字符串构建器实例
        StringBuilder stringBuilder = new StringBuilder();
        //倒序遍历字符串的字符
        for (int i=source.length()-1 ; i>=0 ; i--) {
            //获取当前位置的字符
            char ch = source.charAt(i);
            //将当前字符拼接到字符串构建器中
            stringBuilder.append(ch);
        }
        //返回
        return stringBuilder.toString();
    }

    /**
     * 测试方法
     */
    @Test
    public void test() {
        //给定一个字符串
        String source = "Fabiano";
        //分别用两种方式实现反转
        String result1 = reverse1(source);
        String result2 = reverse2(source);
        //打印
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
    }
}