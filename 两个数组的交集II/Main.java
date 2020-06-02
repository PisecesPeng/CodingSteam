import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = new int[]{9, 4, 9, 8, 4};
        int[] nums2 = new int[]{4, 9, 9, 5};
        System.out.println(func(nums1, nums2));
    }

    private static int[] func(int[] nums1, int[] nums2) {
        // 排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length, length2 = nums2.length;
        int index1 = 0, index2 = 0, indexRes = 0;

        // 存放结果的数组
        int[] res = new int[length1 > length2 ? length1 : length2];
        // 当有一个数组结束遍历, 则终止全部遍历
        // 双指针, 判断指针指定的值大小, 来挪动指针位置
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] == nums2[index2]) {
                res[indexRes++] = nums1[index1];
                index1++;index2++;
                continue;
            }
            if (nums1[index1] > nums2[index2]) index2++;
            else index1++;
        }
        // 截取结果
        return Arrays.copyOf(res, indexRes);
    }

}
