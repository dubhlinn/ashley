package cn.monolog.dubhlinn.ashley.algorithm.recursion;

import org.junit.Test;

/**
 * 递归方式实现字符串反转
 * @author dubhlinn
 * @date 2019-12-01
 */
public class StringReversion {

    /**
     * 字符串反转
     * @param source 需要反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String source) {
        //判空
        if (source == null) {
            return null;
        }
        //如果只有1个字符或0个字符，则返回它自身
        if (source.length() <= 1) {
            return source;
        }
        //获取第一个字符
        char firstChar = source.charAt(0);
        //获取除第一个字符之外的其它部分
        String left = source.substring(1);
        //其它部分继续调用该方法，然后将第一个字符拼到最后
        String result = reverse(left) + firstChar;
        //返回
        return result;
    }

    /**
     * 测试方法
     */
    @Test
    public void test() {
        //给定一个字符串
        String source = "Fabiano";
        //反转
        String result = reverse(source);
        //打印
        System.out.println(result);
    }
}
