package cn.monolog.dubhlinn.ashley.se.hash;

import org.junit.Test;

/**
 * 哈希函数的测试类
 * @author dubhlinn
 * @date 2019-11-28
 */
public class Main {

    /**
     * 测试符合规范的类
     * 当逻辑相等时，哈希值也是相等的
     */
    @Test
    public void test1() {
        //新建两个实例，保证它们的属性都相同
        GoodPerson goodPerson1 = new GoodPerson("张三", 29);
        GoodPerson goodPerson2 = new GoodPerson("张三", 29);

        //比较两个实例是否逻辑相等
        System.out.println("逻辑相等？" + goodPerson1.equals(goodPerson2));

        //比较两个实例的哈希值是否相等
        System.out.println("哈希值相等？" + (goodPerson1.hashCode()==goodPerson2.hashCode()));

        //打印两个实例的哈希值
        System.out.println("实例1的哈希值：" + goodPerson1.hashCode());
        System.out.println("实例2的哈希值：" + goodPerson2.hashCode());
    }

    /**
     * 测试不符合规范的类
     * 当逻辑相等时，哈希值不一定相等
     * 如果这个类的实例作为HashMap的key，会导致相同的key占据了不同的数组位置
     * 如果这个类的实例存入HashSet，会导致产生重复的元素
     */
    @Test
    public void test2() {
        //新建两个实例，保证它们的属性都相同
        BadPerson badPerson1 = new BadPerson("张三", 29);
        BadPerson badPerson2 = new BadPerson("张三", 29);

        //比较两个实例是否逻辑相等
        System.out.println("逻辑相等？" + badPerson1.equals(badPerson2));

        //比较两个实例的哈希值是否相等
        System.out.println("哈希值相等？" + (badPerson1.hashCode()==badPerson2.hashCode()));

        //打印两个实例的哈希值
        System.out.println("实例1的哈希值：" + badPerson1.hashCode());
        System.out.println("实例2的哈希值：" + badPerson2.hashCode());
    }
}
