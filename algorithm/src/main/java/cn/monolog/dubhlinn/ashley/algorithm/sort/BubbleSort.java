package cn.monolog.dubhlinn.ashley.algorithm.sort;

import org.junit.Test;

/**
 * 冒泡排序实现
 * @author dubhlinn
 * @date 2019-11-17
 */
public class BubbleSort {

    /**
     * 冒泡排序方法
     * @param arr 需要排序的数组
     * @return 排序后的数组
     */
    public static void sorting(int[] arr) {
        //获取数组的长度
        int length = arr.length;

        //外层循环，决定需要循环的次数
        for (int i=0 ; i<length-1 ; i++) {
            //内层循环，决定每次循环需要参与的元素
            for (int j=0 ; j<length-i-1 ; j++) {
                //获取相邻的两个元素
                int former = arr[j];
                int latter = arr[j + 1];
                //如果前者大于后者，则交换
                if (former > latter) {
                    arr[j] = latter;
                    arr[j+1] = former;
                }
            }
        }
    }

    /**
     * 测试
     */
    @Test
    public void test() {
        //给定一个数组
        int[] arr = {6,13,1,21,2,15,14,8,7,3,19,4};
        //打印排序前的数组
        System.out.print("排序前：");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        //冒泡排序
        sorting(arr);
        //打印排序后的数组
        System.out.println();
        System.out.print("排序后：");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
