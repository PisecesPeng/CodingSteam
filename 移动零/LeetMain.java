public class LeetMain {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        func(nums);
    }

    private static void func(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0) {
            return;
        }
        int j = 0;  // 零值的个数, 用来计算'双指针'的下标差
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}

