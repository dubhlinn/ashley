package cn.monolog.dubhlinn.ashley.se.stream;

import cn.monolog.dubhlinn.ashley.se.sort.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * jdk1.8——stream包测试类
 * @author dubhlinn
 * @date 2019-12-13
 */
public class Main {

    /*
     * 成员变量，需要遍历的集合
     */
    private List<Person> personList;

    /**
     * 初始化
     */
    @Before
    public void init() {
        Arrays.asList(
                new Person("alex", 29),
                new Person("bob", 31),
                new Person("carl", 32),
                new Person("david", 28),
                new Person("eric", 30),
                new Person("foo", 35)
        );
    }

    /**
     * 获取流
     * 1.Arrays类、Stream类的静态方法，可以用于获取数组的流
     * 2.Collection.stream方法，可以用于获取各种集合的流
     */
    @Test
    public void test1() {
        //数组获取流
        String[] arr = new String[]{"alex", "bob", "carl"};
        Stream<String> streamForArr1 = Arrays.stream(arr);
        Stream<String> streamForArr2 = Stream.of(arr);
        //列表获取流
        List<String> list = new ArrayList<>(Arrays.asList("alex", "bob", "carl"));
        Stream<String> streamForList = list.stream();
    }

    /**
     * 流代替for循环
     */
    @Test
    public void test2() {

    }
}
