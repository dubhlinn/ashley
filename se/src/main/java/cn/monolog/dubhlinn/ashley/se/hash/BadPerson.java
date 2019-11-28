package cn.monolog.dubhlinn.ashley.se.hash;

import java.util.Objects;

/**
 * 不符合规范的实体类
 * 只重写equals方法，不重写hashCode方法
 * 当equals相等时，不保证hash值相等
 * @author dubhlinn
 * @date 2019-11-28
 */
public class BadPerson {
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
    public BadPerson() {
    }

    /**
     * 全参构造方法
     * @param name
     * @param age
     */
    public BadPerson(String name, int age) {
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
     * @param obj 比较的实例
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        //判空
        if (obj == null) {
            return false;
        }

        //如果地址相等，则肯定逻辑相等
        if (this == null) {
            return true;
        }

        //如果类型都不同，肯定逻辑不相等
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        //类型强转
        BadPerson anotherPerson = (BadPerson) obj;

        //比较两个实例的属性
        return Objects.equals(this.getName(), anotherPerson.getName())
                && this.getAge() == anotherPerson.getAge();
    }
}
