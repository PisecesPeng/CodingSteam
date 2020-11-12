public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(func(ints));
    }

    private static int func(int[] ints) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            int v = ints[i];
            // 判定最大最小值
            if (min > v) {
                min = v;
                max = min;  // 最小值刷新时, 重制最大值
            } else if (max < v) {
                max = v;
                result = (result < (max - min)) ? (max - min) : result;  // 最大值刷新时, 重新判断最大利润
            }
        }
        return result;
    }

}
