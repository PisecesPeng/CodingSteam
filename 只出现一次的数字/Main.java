import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(func(nums));
    }

    private static int func(int[] nums) {
        Arrays.sort(nums);
        int index = 1;
        // 由于除去仅出现一次的数字, 其余数字都出现了两次
        // 故仅出现一次的数字下标, 一定为偶数(含0)
        while (index < nums.length) {
            if (nums[index] != nums[index - 1]) return nums[index - 1];
            else index += 2;
        }
        return nums[index - 1];
    }

}
