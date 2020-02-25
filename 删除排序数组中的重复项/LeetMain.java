public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        int count = func(ints);
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int func(int[] ints) {
        if (ints.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < ints.length; j++) {
            // 当且仅当 有序数组的当前值不等于前一个值时
            if (ints[j] != ints[i]) {
                // i自增, 1是为记录当前不重复的值个数, 2是为记录当前这次新值的index(为下次循环比较)
                i++;
                // 将 i下标 赋予当前新的(不重复)值
                ints[i] = ints[j];
            }
        }
        // 加上数组的第一个不重复项
        return i + 1;
    }

}
