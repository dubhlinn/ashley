package cn.monolog.dubhlinn.ashley.se.sort;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类，用于验证对象排序
 * @author dubhlinn
 * @date 2019-11-28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
