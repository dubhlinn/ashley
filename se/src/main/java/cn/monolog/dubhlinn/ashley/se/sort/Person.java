package cn.monolog.dubhlinn.ashley.se.sort;

/**
 * 实体类，用于验证对象排序
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Person {
    /*
     * 姓名
     */
    private String name;
    /*
     * 年龄
     */
    private int age;

    /**
     * getters & setters
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
