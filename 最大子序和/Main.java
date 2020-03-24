public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.printf(String.valueOf(func(nums)));
    }

    private static int func(int[] nums) {
        int r = nums[0], rTmp = 0;
        for (int num : nums) {
            rTmp = (rTmp < 0) ? num : (rTmp + num);  // 若rTmp为负数, 则重新开始寻找新的连续子数组
            if (r < rTmp) r = rTmp;  // 更新连续子数组的最大值
        }
        return r;
    }

}
