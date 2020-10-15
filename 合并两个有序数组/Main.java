public class Main {

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 0};
        int[] nums2 = new int[]{1};
        func(nums1, 1, nums2, 1);
    }

    private static void func(int[] nums1, int m, int[] nums2, int n) {
        // 双指针(从前往后)
        // 新构造一个数组
        int[] nums = new int[m + n];
        int i = 0, j = 0, index = 0;
        while (i < m || j < n) {
            // 双指针遍历两数组, 每次选择小值放入新数组中
            if (j >= n) {
                while (i < m) nums[index++] = nums1[i++];
                break;
            }
            if (i >= m) {
                while (j < n) nums[index++] = nums2[j++];
                break;
            }
            if (nums1[i] < nums2[j])
                nums[index++] = nums1[i++];
            else
                nums[index++] = nums2[j++];
        }
        System.arraycopy(nums,0,nums1,0,nums.length);
    }

}
