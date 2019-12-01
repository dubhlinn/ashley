package cn.monolog.dubhlinn.ashley.se.exception;

import org.junit.Test;

/**
 * 验证try、catch、finally字句的执行顺序
 * @author dubhlinn
 * @date 2019-12-01
 */
public class Demo1 {

    /**
     * try子句中有return
     * 会先执行try子句的其它语句
     * 在return之前执行finally子句
     * 最后再return
     */
    public int method1() {
        int i = 0;
        try {
            i++;
            return i;
        } catch (Exception e) {
        } finally {
           i++;
        }
        return i;
    }

    /**
     * try、finally子句中都有return
     * 会先执行try子句的其它语句
     * 再执行finally子句，直到return
     * try子句中的return无效
     *
     */
    public int method2() {
        int i = 0;
        try {
            i++;
            return i;
        } catch (Exception e) {
        } finally {
            i++;
            return i+1;
        }
    }

    /**
     * 测试方法
     */
    @Test
    public void test() {
        //调用上述方法
        int i1 = this.method1();
        int i2 = this.method2();
        //打印
        System.out.println("i1=" + i1);
        System.out.println("i2=" + i2);
    }
}
