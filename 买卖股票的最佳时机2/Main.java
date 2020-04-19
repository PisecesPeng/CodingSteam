public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(func(ints));
    }

    private static int func(int[] ints) {
        int length;
        if ((length = ints.length) <= 1) return 0;

        int result = 0;  // 收益
        boolean hasBuy = false;  // 是否已买入
        int buyPirce = 0;  // 买入金额
        for (int i = 1; i < length; i++) {
            if (ints[i - 1] > ints[i] && hasBuy) {  // 第i天的价格小于第i-1天的价格 且 是否早已买入
                // 将股票卖出, 重置为未买入状态
                result += ints[i - 1] - buyPirce;
                hasBuy = false;
                buyPirce = 0;
            } else if (ints[i - 1] < ints[i] && !hasBuy) {  // 第i天的价格大于第i-1天的价格
                // 买入股票, 更新买入状态
                hasBuy = true;
                buyPirce = ints[i - 1];
            }
            // ints[i-1] == ints[i], 不做任何操作.
        }
        // 若最后还为'买入'状态, 则将最后一天的股票卖出
        if (hasBuy) result += ints[length - 1] - buyPirce;
        return result;
    }

}
