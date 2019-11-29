package cn.monolog.dubhlinn.ashley.algorithm.sort;

/**
 * 查找数组arr中第k大的奇数，如果不存在则返回0
 * arr[i]>0
 * i>=0
 * 并计算时间复杂度
 * @author dubhlinn
 * @date 2019-11-29
 */
public class Demo2 {
    /**
     * 过滤数组，只保留奇数
     * @param source 过滤前的源数组
     * @return
     */
    private static int[] filterOdd(int[] source) {
        //声明过滤后的数组的下标计数器
        int p = 0;
        //遍历源数组，为了计算过滤后数组的长度
        for (int i=0 ; i<source.length ; i++) {
            //获取第i个元素
            int e = source[i];
            //判断这个元素是否为奇数，如果是奇数，则放入过滤后的数组
            if (e % 2 != 0) {
                p++;
            }
        }
        //声明过滤后的数组
        int[] result = new int[p];
        //下标计数器清零
        p = 0;
        //遍历源数组，将奇数放入过滤后的素组中
        for (int i=0 ; i<source.length ; i++) {
            //获取第i个元素
            int e = source[i];
            //判断这个元素是否为奇数，如果是奇数，则放入过滤后的数组
            if (e % 2 != 0) {
                result[p] = e;
                //计数器加1
                p++;
            }
        }
        //返回过滤后的数组
        return result;
    }

    /**
     * 用冒泡排序的方式，将数组从大到小排序
     * @param source 需要排序的数组
     */
    private static void bubbleSort(int[] source) {
        //外层遍历，决定循环的次数
        for (int i=0 ; i<source.length-1 ; i++) {
            //内层遍历，决定每次遍历涉及的元素
            for (int j=0 ; j<source.length-i-1 ; j++) {
                //如果相邻两个元素不是按降序排列，则交换
                int former = source[j];
                int latter = source[j+1];
                if (former < latter) {
                    source[j] = latter;
                    source[j+1] = former;
                }
            }
        }
    }

    /**
     * 查找数组的指定顺序的奇数
     * @param arr 给定数组
     * @param k 第几个奇数
     * @return
     */
    public static int findKth(int[] arr, int k) {
        //过滤数组，只保留奇数
        int[] oddArr = filterOdd(arr);
        //对奇数数组进行排序，从大到小
        bubbleSort(oddArr);
        //捕获数组越界异常
        try {
            //尝试返回指定元素
            return oddArr[k-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            //如果越界，则返回0
            return 0;
        }
    }

    /**
     * 测试类
     * @param args
     */
    public static void main(String[] args) {
        //给定一个数组
        int[] arr = {12,7,6,9,22,21,4,3,14,18,15,28,13,67,35,34,30,29,44,49,53,54,98,2,1,61};
        //给定顺序数
        int k = 60;
        //查找数组第k大的奇数
        int result = findKth(arr, k);
        //打印结果
        System.out.println("数组的第" + k +"大的奇数为：" + result);
    }
}
