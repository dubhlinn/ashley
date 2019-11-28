package cn.monolog.dubhlinn.ashley.se.sort;

import java.util.Comparator;

/**
 * 排序规则
 * 用于cn.monolog.dubhlinn.ashley.se.sort.Person实体类
 * @author dubhlinn
 * @date 2019-11-28
 */
public class PersonComparator implements Comparator<Person> {

    /**
     * 重写compare方法
     * 使用age属性排序
     * @param o1
     * @param o2
     * @return
     */
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
}
