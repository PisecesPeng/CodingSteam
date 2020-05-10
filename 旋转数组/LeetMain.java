public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        int k = 3;
        func1(ints, k);
        func2(ints, k);
        func3(ints, k);
    }

    // 暴力法
    private static void func1(int[] nums, int k) {
        // 旋转 k 次, 每次将数组旋转1个元素
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    // 环状替代
    private static void func2(int[] nums, int k) {
        // 将每个元素的值直接赋予最终位置
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    // 反转数组
    private static void func3(int[] nums, int k) {
        // 反转三次数组, 直接得出答案
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
