package cn.monolog.dubhlinn.ashley.se.synthetical;

/**
 * 演示引用传递和值传递
 * 数组是对象类型，在形参中是引用传递，方法中的操作会改变原始引用
 * 字符串虽然是对象类型，但由于其并没有改变自身的方法，也类似于值传递
 * @author dubhlinn
 * @date 2019-11-17
 * @genuine
 */
public class Demo1 {

    //两个成员变量，一个字符串，一个字符数组
    private String str = "hello";
    private char[] ch = {'w', 'o', 'r', 'l', 'd'};

    /**
     * 修改字符串和字符
     * @param str 字符串
     * @param ch 字符数组
     */
    public void change(String str, char[] ch) {
        str = "goodbye";
        ch[0] = 'f';
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //新建本类实例
        Demo1 instance = new Demo1();
        //调用change方法，将成员变量传入
        instance.change(instance.str, instance.ch);
        //打印结果
        System.out.print(instance.str + " ");
        System.out.println(instance.ch);
    }
}
