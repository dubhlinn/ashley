package cn.monolog.dubhlinn.ashley.se.hash;

import java.util.Objects;

/**
 * 符合规范的实体类
 * 重写equals、不重写hashCode
 * 保证equals相等的时候，hash值也相等
 * @author dubhlinn
 * @date 2019-11-28
 */
public class GoodPerson {
    /*
     * 姓名
     */
    private String name;

    /*
     * 年龄
     */
    private int age;

    /**
     * 无参构造方法
     */
    public GoodPerson() {
    }

    /**
     * 全参构造方法
     * @param name
     * @param age
     */
    public GoodPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
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
     * 重写equals方法
     * 如果两个属性都相同，则认为逻辑相等
     * @param obj 比较的实例
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        //判空
        if (obj == null) {
            return false;
        }

        //如果地址相等，则逻辑相等
        if (this == obj) {
            return true;
        }

        //如果类型都不同，那肯定逻辑不相等
        if (this.getClass() != this.getClass()) {
            return false;
        }

        //类型强转
        GoodPerson anotherPerson = (GoodPerson) obj;

        //比较两个实例的属性
        return Objects.equals(this.getName(), anotherPerson.getName())
                && this.getAge() == anotherPerson.getAge();
    }

    /**
     * 重写hashCode方法
     * 根据两个属性计算hash值
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }
}
