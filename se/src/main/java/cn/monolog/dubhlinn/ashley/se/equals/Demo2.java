package cn.monolog.dubhlinn.ashley.se.equals;

import org.junit.Test;

/**
 * 验证字符串==
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Demo2 {

    /**
     * 测试字符串拼接状态下的==
     */
    @Test
    public void test1() {
        String str = "llo";
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = "he" + "llo";
        String str4 = "he" + str;
        System.err.println(str1 == str2);
        System.err.println(str1 == str3);
        System.err.println(str1 == str4);
        System.err.println(str1 == str1.intern());
    }
}
