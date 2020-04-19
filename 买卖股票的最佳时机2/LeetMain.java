public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(func(ints));
    }

//    private static int func(int[] ints) {
//        // 直接将所有的连续利润为正数的值 求和
//        int maxprofit = 0;
//        for (int i = 1; i < ints.length; i++) {
//            if (ints[i] > ints[i - 1])
//                maxprofit += ints[i] - ints[i - 1];
//        }
//        return maxprofit;
//    }

    private static int func(int[] ints) {
        int i = 0;
        int valley = ints[0];
        int peak = ints[0];
        int maxprofit = 0;
        while (i < ints.length - 1) {
            // 得出 股票价值 跌到谷底的值
            while (i < ints.length - 1 && ints[i] >= ints[i + 1])
                i++;
            valley = ints[i];
            // 得出 股票价值 增到顶点的值
            while (i < ints.length - 1 && ints[i] <= ints[i + 1])
                i++;
            peak = ints[i];
            // 计算当次两者的差值
            maxprofit += peak - valley;
        }
        return maxprofit;
    }

}
