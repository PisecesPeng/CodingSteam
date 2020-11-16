public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{2, 7, 9, 3, 1, 8, 1};
        System.out.println(func(ints));
    }

    public static int func(int[] ints) {
        if (ints == null || ints.length == 0) {
            return 0;
        }
        int length = ints.length;
        if (length == 1) {
            return ints[0];
        }
        // 滚动数组 叠加金额
        int first = ints[0], second = Math.max(ints[0], ints[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first + ints[i], second);
            first = temp;
        }
        return second;
    }

}
