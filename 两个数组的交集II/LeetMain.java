import java.util.Arrays;
import java.util.HashMap;

public class LeetMain {

    public static void main(String[] args) {
        int[] nums1 = new int[]{9, 4, 9, 8, 4};
        int[] nums2 = new int[]{4, 9, 9, 5};
        System.out.println(func(nums1, nums2));
    }

    private static int[] func(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return func(nums2, nums1);
        }
        // 将num1的值存入Map中(累加次数), 再用num2的值最为key去查(删减次数)
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        int k = 0;
        for (int n : nums2) {
            int cnt = m.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                m.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

}
