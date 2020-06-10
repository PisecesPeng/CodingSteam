import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        func(nums);
        System.out.println();
    }

    private static void func(int[] nums) {
        int length;
        if (Objects.isNull(nums) || (length = nums.length) < 1) return;
        int zeroNum = 0;  // 零值的个数, 用来计算'双指针'的下标差
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zeroNum++;
                continue;
            } else if (zeroNum > 0) {
                nums[i - zeroNum] = nums[i];
                nums[i] = 0;
            }
        }
    }

}
