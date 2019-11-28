package cn.monolog.dubhlinn.ashley.se.synthetical;

/**
 * 用于验证String的不可变特性
 * @author dubhlinn
 * @date 2019-11-17
 */
public class Demo1 {

    //两个成员变量，一个字符串，一个字符
    private String str = new String("hello");
    private char[] ch = {'w', 'o', 'r', 'l', 'd'};

    /**
     * 修改字符串和字符
     * @param str 字符串
     * @param ch 字符
     */
    public void change(String str, char[] ch) {
        str = "goodbye";
        ch[0] = 'f';
    }

    /**
     * 测试
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
