package cn.monolog.dubhlinn.ashley.se.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * 对象比较测试类
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Main {

    /*
     * 成员变量
     */
    Person p1 = null;
    Person p2 = null;
    Person p3 = null;
    Person p4 = null;

    /**
     * 在测试之前，实例化四个成员变量
     */
    @Before
    public void generateInstances() {
        p1 = new Person();
        p1.setName("张三");
        p1.setAge(36);
        p2 = new Person();
        p2.setName("李四");
        p2.setAge(28);
        p3 = new Person();
        p3.setName("王五");
        p3.setAge(33);
        p4 = new Person();
        p4.setName("赵六");
        p4.setAge(32);
    }

    /**
     * 使用Comparator接口排序
     */
    @Test
    public void test1() {
        //新建列表，将4个成员变量放进去
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        //打印排序前的列表
        System.out.println("排序前");
        personList.forEach(person -> System.out.println(person));

        //按年龄排序
        Collections.sort(personList, new PersonComparator());

        //打印排序后的列表
        System.out.println("排序后");
        personList.forEach(person -> System.out.println(person));
    }

}
