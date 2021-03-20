public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{3,-1,-3,5,3,6,7};
        int k = 3;
        func(nums, k);
    }

    private static int maxIdx = -1;

    public static int[] func(int[] nums, int k) {
        if (nums.length <= 1) {
            return nums;
        }
        int[] r = new int[nums.length - k + 1];
        int rIdx = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (i <= maxIdx) {
                int newIdx = i + k - 1;
                int newValue = nums[newIdx];
                int preValue = r[rIdx - 1];
                if (preValue < newValue) {
                    r[rIdx++] = newValue;
                    maxIdx = newIdx;
                } else {
                    r[rIdx++] = preValue;
                }
            } else {
                r[rIdx++] = max(nums, i, k - 1, nums[i]);
            }
        }
        return r;
    }

    public static int max(int[] nums, int from, int time, int value) {
        if (value < nums[from]) {
            value = nums[from];
            maxIdx = from;
        }
        if (time <= 0)
            return value;
        else
            return max(nums, ++from, --time, value);
    }

}
