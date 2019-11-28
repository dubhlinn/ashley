package cn.monolog.dubhlinn.ashley.se.equals;

import org.junit.Test;

/**
 * 验证字符串==
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Demo3 {

    /**
     * 测试字符串拼接状态下的==
     */
    @Test
    public void test1() {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.err.println(str1 == str2);
    }
}
