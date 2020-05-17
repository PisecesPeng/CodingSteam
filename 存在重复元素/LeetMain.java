public class LeetMain {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 1, 6};
        System.out.println(func(nums));
    }

    private static boolean func(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

}
