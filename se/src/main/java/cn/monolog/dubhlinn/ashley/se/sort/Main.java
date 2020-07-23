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

    /**
     * 使用TreeSet排序+去重
     * 利用TreeSet的构造方法之一是接收Comparator作为参数
     */
    @Test
    public void test2() {
        //新建列表，将4个成员变量放进去
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        //打印排序前的列表
        System.out.println("排序前");
        personList.forEach(person -> System.out.println(person));

        //新建TreeSet
        TreeSet<Person> personSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                return 0;
            }
        });

        //将列表的元素放入集合
        personSet.addAll(personList);

        //清空列表，然后用集合重构列表
        personList.clear();
        personList.addAll(personSet);

        //打印排序后的列表
        System.out.println("排序后");
        personList.forEach(person -> System.out.println(person));
    }

    /**
     * 性能测试：大数据量排序
     */
    @Test
    public void test3() {
        //新建随机数工具实例
        Random random = new Random();

        //新建2万条数据
        List<Person> persons = new ArrayList<>();
        for (int i = 0 ; i < 20000 ; i++) {
            Person person = Person.builder()
                    .name("王" + random.nextInt())
                    .age(random.nextInt(1000000))
                    .build();
            persons.add(person);
        }

        //获取排序前的时间戳
        long start = System.currentTimeMillis();

        //按年龄倒序排列
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //获取排序后的时间戳
        long end = System.currentTimeMillis();

        //打印排序耗时
        System.out.println("排序耗时：" + (end - start) + "毫秒");
    }
}
