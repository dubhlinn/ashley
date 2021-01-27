package cn.monolog.dubhlinn.ashley.se.equation.line;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Classname 多元一次方程组的解法
 * @Description
 * @Author YinHF
 * @Date 2021-01-08
 */
public class LineEquationUtil {
    /**
     * 工具类、禁止实例化
     */
    private LineEquationUtil() {
    }

    /**
     * 方程组的缺省解，用于特殊情况：
     * 1、方程组矩阵不正确，例如为空、未知数数量大于方程数量、未知数数量小于方程数量、系数或常量存在null等
     * 2、方程无解、或解不唯一
     */
    private static final BigDecimal[] DEFAULT_RESULTS = new BigDecimal[0];

    /**
     * 解方程
     * @param matrix 系数及常量矩阵
     * @param scale 保留小数的位数
     * @param roundingMode 进位规则
     * @return 方程的解的数组 正常情况下，其长度等于matrix的行数；特殊情况(入参格式不对或方程无解等)，返回空数组
     */
    public static BigDecimal[] solve(Double[][] matrix, int scale, RoundingMode roundingMode) {
        //矩阵校验
        if (!validationForMatrix(matrix)) {
            return DEFAULT_RESULTS;
        }

        //转为上三角矩阵
        upperTriangularize(matrix);

        //获取方程组的解(double类型)
        double[] rawResults = getResults(matrix);

        //解判空
        if (rawResults == null) {
            return DEFAULT_RESULTS;
        }

        //声明方程组的解
        BigDecimal[] results = new BigDecimal[matrix.length];

        //结果组装
        for (int i = 0 ; i < matrix.length ; i++) {
            //数据类型转换、归并
            results[i] = BigDecimal.valueOf(rawResults[i]).setScale(scale, roundingMode);
        }

        //返回
        return results;
    }

    /**
     * 对上三角矩阵的方程求解
     * @param upperTriangularMatrix 上三角矩阵 必填、非空
     * @see cn.monolog.dubhlinn.ashley.se.equation.line.LineEquationUtil#validationForMatrix(java.lang.Double[][])
     * @return 解的数组 无解时返回null
     */
    private static double[] getResults(Double[][] upperTriangularMatrix) {
        //求矩阵的行数、列数
        int rowNum = upperTriangularMatrix.length;
        int columnNum = upperTriangularMatrix[0].length;

        //声明解的数组
        double[] results = new double[rowNum];

        //反向遍历矩阵的每一行
        for (int i = rowNum - 1 ; i >= 0 ; i--) {
            //获取方程的系数
            double coefficient = upperTriangularMatrix[i][i];

            //声明方程的常数部分
            double constant = upperTriangularMatrix[i][columnNum - 1];

            //减掉已经算出来的部分
            for (int j = i + 1 ; j < columnNum - 1 ; j++) {
                constant -= upperTriangularMatrix[i][j] * results[j];
            }

            //特判——无解、非唯一解
            if (coefficient == 0D) {
                return null;
            }

            //求解、归并
            results[i] = constant / coefficient;
        }

        //返回
        return results;
    }

    /**
     * 矩阵校验
     * 规则：
     *     |-1、矩阵本身不能为null或空
     *     |-2、矩阵的行数必须等于(列数-1)
     *     |-3、矩阵的元素不能有null
     * @param matrix 方程的系数及常量矩阵
     * @return 符合规则为true，不符合规则为false
     */
    private static boolean validationForMatrix(Double[][] matrix) {
        //矩阵判空
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        //矩阵行数、列数
        if (matrix.length != matrix[0].length - 1) {
            return false;
        }

        //矩阵元素不能有null
        for (Double[] subMatrix : matrix) {
            for (Double element : subMatrix) {
                if (element == null) {
                    return false;
                }
            }
        }

        //返回缺省结论
        return true;
    }

    /**
     * 将源矩阵转为上三角矩阵
     * @param matrix 源矩阵 调用前需要校验，规则见
     * @see cn.monolog.dubhlinn.ashley.se.equation.line.LineEquationUtil#validationForMatrix(java.lang.Double[][])
     */
    private static void upperTriangularize(Double[][] matrix) {
        //第一层循环：矩阵的行，以下称为——选中行
        for (int i = 1 ;  i < matrix.length ; i++) {
            //获取选中行
            Double[] selectedRow = matrix[i];

            //第二层循环：选中行的上面的所有行，以下称为——比较行
            for (int j = 0 ; j < i ; j++) {
                //计算选中行应该乘以的比例
                double ratio = matrix[j][j] / selectedRow[j];

                //第三层循环：选中行的每一个元素
                for (int k = 0 ; k < selectedRow.length ; k++) {
                    //区分元素位置
                    if (k <= j) {
                        //前j个元素重置为0
                        selectedRow[k] = 0D;
                    } else {
                        //后面的元素求差
                        selectedRow[k] = selectedRow[k] * ratio - matrix[j][k];
                    }
                }
            }
        }
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //声明方程组的矩阵
        Double[][] matrix = {{1D, 1D, 1D, 10D}, {2D, 3D, 4D, 24D}, {3D, 5D, 6D, 35D}};

        //调用目标方法
        BigDecimal[] results = solve(matrix, 2, RoundingMode.HALF_UP);

        //打印结果
        for (BigDecimal result : results) {
            System.out.print(result + ", ");
        }
    }
}
