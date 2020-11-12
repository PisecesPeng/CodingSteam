public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(func(ints));
    }

    public static int func(int[] ints) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < ints.length; i++) {
            // 判断最大最小值
            if (ints[i] < minprice) {
                minprice = ints[i];
            }
            // 当最大利润大于之前的利润, 重制
            else if (ints[i] - minprice > maxprofit) {
                maxprofit = ints[i] - minprice;
            }
        }
        return maxprofit;
    }

}
