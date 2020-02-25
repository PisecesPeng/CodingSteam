public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        int count = func(ints);
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int func(int[] ints) {
        // 判断数组是否有值
        int count = ints.length > 0 ? 1 : 0;
        for (int i = 1; i < ints.length; i++) {
            // 当且仅当 有序数组的当前值大于前一个值时
            if (ints[i] > ints[i - 1]) {
                // 将 count下标 赋予当前新的(不重复)值
                ints[count] = ints[i];
                // count自增, 1是为记录当前不重复的值个数, 2是为记录下一次新值的index
                count++;
            }
        }
        return count;
    }

}
