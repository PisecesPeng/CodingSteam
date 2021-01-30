public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(new int[]{3, 0, 1}));
    }

    private static int func(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

}
