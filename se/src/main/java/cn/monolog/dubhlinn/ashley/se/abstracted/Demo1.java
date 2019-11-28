package cn.monolog.dubhlinn.ashley.se.abstracted;

/**
 * 验证抽象类的使用规则
 * 三个方法定义，只有一个编译通过
 * @author dubhlinn
 * @date 2019-11-28
 */
public abstract class Demo1 {
    public int constInt = 5;

    public abstract void method(int a);  //本行编译通过，方法重载有不同的参数列表，而且抽象方法没有实现

//    public int method();  //本行编译错误，因为方法重载必须有不同的参数列表

//    public abstract void anothoerMethod() {};  //本行编译错误，因为抽象方法不能有实现

    public void method() {}
}
