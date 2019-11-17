package cn.monolog.dubhlinn.ashley.algorithm.sort;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.junit.Test;

import java.util.*;

/**
 * 给定一组数字，统计每个数字出现的次数，并按降序打印
 * 例如，给定的是[3,6,3,5,1,1,5,5,3,3]
 * 应该打印的出来的是如下答案
 * 3:出现4次
 * 5:出现3次
 * 1:出现2次
 * 6:出现1次
 * @author dubhlinn
 * @date 2019-11-16
 */
public class Demo1 {

    /**
     * 将数组按元素分组，然后将其出现的次数放入映射中
     * @param source 需要分组的数组
     * @param <T> 泛型
     * @return 映射，key为元素，value为元素出现的次数
     */
    public static <T> Map<T, Integer> grouping(T[] source) {
        //声明结果映射
        Map<T, Integer> resultMap = new HashMap<T, Integer>();

        //遍历源数组
        for (int i=0 ; i<source.length; i++) {
            //获取第i个元素
            T element = source[i];
            //判断结果映射中是否存在这个元素的key
            if (resultMap.containsKey(element)) {
                //如果存在，就把value加1
                Integer num = resultMap.get(element);
                resultMap.put(element, num+1);
            } else {
                //如果不存在，就放入这个key
                resultMap.put(element, 1);
            }
        }

        //返回结果映射
        return resultMap;
    }

    /**
     * 按映射的num值排序
     * 原理为冒泡排序
     * @param source 排序前的列表
     * @return 排序后的列表
     */
    public static List<Map<String, Object>> sorting(List<Map<String, Object>> source) {
        //第一次遍历，循环次数
        for (int i=0 ; i<source.size()-1; i++) {
            //第二次遍历，每次循环到的元素
            for (int j=0 ; j<source.size()-i-1 ; j++) {
                //获取相邻两个元素
                Map<String, Object> former = source.get(j);
                Map<String, Object> latter = source.get(j + 1);
                //比较两个元素的num，如果前者小于后者，则调换
                Integer formerNum = (Integer) former.get("num");
                Integer latterNum = (Integer) latter.get("num");
                if (formerNum < latterNum) {
                    source.set(j, latter);
                    source.set(j+1, former);
                }
            }
        }

        //返回排序后的列表
        return  source;
    }

    /**
     * 测试
     */
    @Test
    public void test() {
        //任意给定一个数组
        Integer[] source = {3,6,3,5,1,6,1,5,5,3,3,8,8,6,3,5,4,1,5,3,8,9,3,9,6};
        //分组
        Map<Integer, Integer> groupingResult = grouping(source);
        //将映射转为列表
        List<Map<String, Object>> sourceList = new ArrayList<Map<String, Object>>();
        Iterator<Map.Entry<Integer, Integer>> iterator = groupingResult.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            HashMap elementMap = new HashMap();
            elementMap.put("element", entry.getKey());
            elementMap.put("num", entry.getValue());
            sourceList.add(elementMap);
        }
        //排序
        sorting(sourceList);
        //打印
        for (Map<String, Object> elementMap : sourceList) {
            Integer element = (Integer) elementMap.get("element");
            Integer num = (Integer) elementMap.get("num");
            System.out.println(element + ":出现了" + num + "次");
        }
    }
}