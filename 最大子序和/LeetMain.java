public class LeetMain {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.printf(String.valueOf(func(nums)));
    }

    private static int func(int[] nums) {
        int currSum = nums[0], maxSum = nums[0];
        for (int i = 0, n = nums.length; i < n; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);  // 若currSum为负数, 则重新开始寻找新的连续子数组
            maxSum = Math.max(maxSum, currSum);  // 保持连续子数组的最大值
        }
        return maxSum;
    }

}
