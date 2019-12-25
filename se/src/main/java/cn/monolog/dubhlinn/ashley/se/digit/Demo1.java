package cn.monolog.dubhlinn.ashley.se.digit;

import org.junit.Test;

/**
 * 验证一些数字运算的例子
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Demo1 {

    /**
     * float计算结果
     * 分析：等号右边如果直接声明10和4，默认为int类型，它们俩做除法，结果还是int类型
     * 如果想得到float类型的结果，要么声明的时候加F，要么在计算之后加强转
     */
    @Test
    public void test1() {
        float x;
        x = 10 / 4;
        float y;
        y = 10F / 4F;
        float z;
        z = (float) 10 / 4;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }

    /**
     * 各种基本类型变量的声明
     * 分析：double类型的数字要加d，long类型的数字要加l，但是都可以省略
     * 唯独float类型的f不能省略，否则编译错误，因为省略时默认为double，向下转型会丢精度
     */
    @Test
    public void test2() {
        int i = 10;
//        float f = 1.1; //本行编译错误，1.1默认为double类型，不能向下转型
        double fd = 34.4F;  //本行编译通过，可以向上转型
        double d = 34.4;
        long l = 4990;
    }

    /**
     * +=与自动强转
     * +=会根据需要添加自动强转
     */
    @Test
    public void test3() {
        short s1 = 1;
//        s1 = s1 + 1;  //本行编译错误，因为1默认为int类型，加法会先自动强转到精度更高的类型再做计算
        s1 += 1;  //本行编译通过，相当于 s1 = (short) (s1+1)
        s1 = (short) (s1 + 1);
    }

    /**
     * int类型的除法
     * 两个int类型的数字相除，结果还是int
     * 而且并不会四舍五入，而是向下取整
     * 如果用double类型来接收计算结果，也是先得到一个int，再强转为double
     */
    @Test
    public void test4() {
        int i = 10 / 4;
        double j = 10 / 4;
        System.out.println("10/4=" + i);
        System.out.println("10/4=" + j);
    }
}
