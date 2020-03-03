public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int cutIndex = func(ints, 2);
        System.out.println(cutIndex);

        for (int i = 0; i < cutIndex; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int func(int[] ints, int val) {
        int i = 0;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] != val) {
                ints[i] = ints[j];  // 当且仅当不等于val值时, 将当前的值向前填充
                i++;
            }
        }
        return i;
    }

}
