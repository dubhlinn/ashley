package cn.monolog.dubhlinn.ashley.se.collection;

import org.junit.Test;

import java.util.Random;

/**
 * 产生一个长度为100的int数组，并向其中插入1-100，且不能重复
 * @author dubhlinn
 * @date 2019-11-17
 */
public class Demo1 {

    /**
     * 产生指定长度的随机数组
     * 并插入不重复的随机数
     * @param n 随机数组的长度
     * @return 随机数组
     */
    public static int[] generateRandomArr(int n) {
        //声明数组
        int[] resultArr = new int[n];

        //新建随机数工具实例
        Random random = new Random();

        //遍历数组
        for (int i=0 ; i<resultArr.length ; i++) {
            //对第i个元素进行赋值
            resultArr[i] = random.nextInt(n) + 1;

            //声明布尔类型的变量，用于标识数组中的既有元素有没有跟刚刚生成的这个重复的
            boolean isDuplicated = false;

            do {
                //初始化isDuplicated
                isDuplicated = false;

                //判断数组中的既有元素有没有跟刚刚生成的这个重复的
                for (int j=0 ; j<i ; j++) {
                    if (resultArr[j] == resultArr[i]) {
                        //如果有重复的，就对标识变量isDuplicated重新赋值
                        isDuplicated = true;
                        break;
                    }
                }

                //如果有重复的，就对数组中的这个元素重新生成随机数
                if (isDuplicated) {
                    resultArr[i] = random.nextInt(n) + 1;
                }
            } while (isDuplicated);
        }

        //返回数组
        return resultArr;
    }

    /**
     * 测试
     */
    @Test
    public void test() {
        //给定数组长度
        int n = 100;
        //生成随机数组
        int[] resultArr = generateRandomArr(n);
        //打印随机数组
        for (int element : resultArr) {
            System.out.print(element + " ");
        }
    }
}
