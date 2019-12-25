package cn.monolog.dubhlinn.ashley.algorithm.synthetical;

/**
 * 给定一个字符串，字符串只由0或1组成
 * 返回字符串中交替子串的最大长度
 * 所谓交替子串，是指0和1交替出现，不重复
 * 例如，10011010001101010100000中，
 * 共有10、01、1010、10101010这几个交替子串，因此最大长度为8
 * @author dubhlinn
 * @date 2019-12-25
 */
public class Demo2 {

    /**
     * 获取字符串的最大交替子串的长度
     * @param source 给定的字符串
     * @return
     */
    public static int getMaxAlterningLength(String source) {
        //声明最大交替子串的长度
        int maxAlternatingLength = 1;

        //外层循环，遍历每一个字符
        for (int i=0 ; i<source.length() ; i++) {
            //记录本轮循环得到的临时最大长度，并初始化为1
            int temporaryLength = 1;

            //获取当前字符
            char currentChar = source.charAt(i);

            //内层循环，遍历当前字符后面的字符
            for (int j=i+1 ; j<source.length(); j++) {
                //获取后面的字符
                char latterChar = source.charAt(j);
                //如果两个字符之间的间隔为偶数，则应该相同；反之应该不同
                if ((j-i) % 2 == 0) {
                    if (latterChar == currentChar) {
                        temporaryLength++;
                    } else {
                        break;
                    }
                } else {
                    if (latterChar != currentChar) {
                        temporaryLength++;
                    } else {
                        break;
                    }
                }
            }

            //判断本轮循环得到的临时长度是否超过了之前的结果
            if (temporaryLength > maxAlternatingLength) {
                maxAlternatingLength = temporaryLength;
            }
        }

        //返回
        return maxAlternatingLength;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //给定字符串
        String source = "10011010001101010100000";
        //获取最大交替子串的长度
        int maxAlterningLength = getMaxAlterningLength(source);
        //输出
        System.out.println(source + "的最大交替字串长度为：" + maxAlterningLength);
    }
}
