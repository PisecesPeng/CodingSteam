public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        func(matrix);
    }

    private static void func(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i <= (length - 1) / 2; i++) {  // 只需旋转 一半的行值
            for (int j = i; j < length - i - 1; j++) {  // 只需旋转 所有值列(除去最后一个)
                int boxLastIdx = length - i - 1;
                // 顺时针 赋值四次
                int v1 = matrix[i][j];

                // 旋转第一次
                // 永远是将值旋转到最后一列, 得出'j'
                // 将上一次值下标的'j'赋值给下一次值下标'i'
                int v2 = matrix[j][boxLastIdx];
                matrix[j][boxLastIdx] = v1;

                // 旋转第二次
                // 永远是将值旋转到最后一行, 其列位置根据'i'的增长而缩小
                // 将上一次值下标的'j'赋值给下一次值下标'i'
                int v3 = matrix[boxLastIdx][boxLastIdx - j + i];
                matrix[boxLastIdx][boxLastIdx - j + i] = v2;

                // 旋转第三次
                // 永远是将值旋转到第一列
                // 将上一次值下标的'j'赋值给下一次值下标'i'
                int v4 = matrix[boxLastIdx - j + i][i];
                matrix[boxLastIdx - j + i][i] = v3;

                // 旋转第四次
                // 将值赋给 起点下标 即可
                matrix[i][j] = v4;
            }
        }
    }
}