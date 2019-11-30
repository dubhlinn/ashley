package cn.monolog.dubhlinn.ashley.se.synthetical;

import org.junit.Test;

/**
 * 演示引用传递和值传递
 * 一般来说，基本类型数据是值传递，形参接收的是原始值的一个备份，所以方法中对形参的操作不会影响原始变量
 * 对象类型数据是引用传递，形参接收的是引用，所以方法中对形参的操作会影响原始引用
 * 但是String、Double、Integer等类比较特殊，类似于基本类型数据，可以理解为值传递
 * @author dubhlinn
 * @date 2019-11-30
 */
public class TransmitWay {

    /*
     * 一些成员变量，有的属于基本类型，有的属于对象类型
     */
    private int i = 1;
    private float[] floats = {1.0F, 2.0F, 3.0F};
    private StringBuilder stringBuilder = new StringBuilder("hello");
    private String str = new String("hello");

    /**
     * 对int类型的参数做处理
     * @param i
     */
    private void changeInt(int i) {
        i++;
    }

    /**
     * 对float数组类型的参数做处理
     * @param floats
     */
    private void changeFloatArr(float[] floats) {
        floats[2] = 4.0F;
    }

    /**
     * 对StringBuilder类型的参数做处理
     * @param stringBuilder
     */
    private void changeStringBuilder(StringBuilder stringBuilder) {
        stringBuilder.append(" world");
    }

    /**
     * 对String类型的参数做处理
     * @param str
     */
    private void changeString(String str) {
        str += " world";
    }

    /**
     * 测试方法
     */
    @Test
    public void test() {
        //打印修改前的成员变量
        System.out.println("i=" + this.i);
        System.out.println("floatMax=" + this.floats[2]);
        System.out.println("stringBuilder=" + this.stringBuilder.toString());
        System.out.println("str=" + this.str);
        //分别调用方法，修改成员变量
        this.changeInt(this.i);
        this.changeFloatArr(this.floats);
        this.changeStringBuilder(this.stringBuilder);
        this.changeString(this.str);
        //打印修改后的成员变量
        System.out.println("===============================");
        System.out.println("i=" + this.i);
        System.out.println("floatMax=" + this.floats[2]);
        System.out.println("stringBuilder=" + this.stringBuilder.toString());
        System.out.println("str=" + this.str);
    }
}
