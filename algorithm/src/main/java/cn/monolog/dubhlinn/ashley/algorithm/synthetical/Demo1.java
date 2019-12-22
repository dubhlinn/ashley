package cn.monolog.dubhlinn.ashley.algorithm.synthetical;

import java.util.ArrayList;
import java.util.List;

/**
 * 输出1-100000之间的对称数
 * 例如131,3663,58185等
 * @author dubhlinn
 * @date 2019-12-22
 */
public class Demo1 {

    /**
     * 获取从1到boundary之间的对称数
     * @param boundary 上限
     * @return
     */
    public static List<Integer> getSymmetricalNumbers(int boundary) {
        //声明结果集
        List<Integer> resultList = new ArrayList<>();

        //遍历
        for (int i=1 ; i<=boundary ; i++) {
            //声明本轮判断标识，并初始化
            boolean isSymmetrical = true;
            //将数字转换成字符串
            String str = String.valueOf(i);
            //获取字符串的长度，即数字的位数
            int length = str.length();
            //如果是一位，则跳过，因为一位数字不存在对称的概念
            if (length == 1) {
                continue;
            }

            //比较从第一位到第length/2位的字符，跟它对称位置的字符是否相等
            for (int j=0 ; j<length/2 ; j++) {
                char formerChar = str.charAt(j);
                char latterChar = str.charAt(length - j - 1);
                //如果存在一个不等的，更新标识，并立刻退出内层循环
                if (formerChar != latterChar) {
                    isSymmetrical = false;
                    break;
                }
            }

            //根据标识，判断是否需要将该数字放入结果集
            if (isSymmetrical) {
                resultList.add(i);
            }
        }

        //返回结果集
        return resultList;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //给定一个上限
        int boundary = 100000;
        //获取从1到上限之间的对称数
        List<Integer> symmetricalNumbers = getSymmetricalNumbers(boundary);
        //输出
        for (Integer symmetricalNum : symmetricalNumbers) {
            System.out.println(symmetricalNum);
        }
    }
}
