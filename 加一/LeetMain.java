public class LeetMain {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 9, 9, 9};
        func(nums);
    }

    private static int[] func(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            nums[i]++;
            nums[i] %= 10;
            // +1后的值取余, 若是未进位, 则说明小于9, 直接返回结果
            if (nums[i] != 0) return nums;
        }
        // 若是每个数字都进位, 则直接new新数组, 且最高位设置1即可.
        nums = new int[len + 1];
        nums[0] = 1;
        return nums;
    }

}
