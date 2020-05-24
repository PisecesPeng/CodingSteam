public class LeetMain {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(func(nums));
    }

    private static int func(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;  // 异或找出仅出现一次的数字
        }
        return single;
    }
}

