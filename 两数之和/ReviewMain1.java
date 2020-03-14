import java.util.*;

public class ReviewMain1 {
    public static void main(String[] args) {
        // 数组与目标值
        int[] nums = new int[]{2, 8, 11, 7, 7, 2, 10, -1, 9, 0};
        int target = 9;

        func(nums, target).forEach(x -> System.out.print(x + " "));
    }

    private static List<Integer> func(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();  // 存放结果

        int[] sortNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortNums);  // 排序(为下文的二分法查找做准备)
        // 确认最小值是否大于target
        if (sortNums[0] > target) return result;

        int length = sortNums.length;
        Integer v1 = null, v2 = null;  // 存放符合题意的两个值
        // 二分法查找
        for (int i = 0; i < sortNums.length; i++) {
            // 先确定如果有两个符合题意的数字, 其数值应该是多少
            int leftNum = sortNums[i];
            int rightNum = target - leftNum;
            // 设置二分法查找的index范围
            int leftIndex = i + 1;
            int rightIndex = length - 1;
            while (leftIndex < rightIndex) {
                int midIndex = (leftIndex + rightIndex) / 2;
                // 如果找到符合题意的数组, 直接设置v1、v2的值, 并跳出循环
                if (sortNums[midIndex] == rightNum) {
                    v1 = leftNum;
                    v2 = rightNum;
                    break;
                }
                if (sortNums[midIndex] > rightNum) {
                    rightIndex = midIndex;
                } else {
                    leftIndex = midIndex + 1;
                }
            }
            // 若v1、v2不为null, 则直接跳出循环
            if (!Objects.isNull(v1) && !Objects.isNull(v2)) break;
        }

        // 再根据v1、v2的值, 遍历nums[]取得下标
        if (!Objects.isNull(v1) && !Objects.isNull(v2)) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == v1 || nums[i] == v2) {
                    if (result.size() >= 2) {
                        break;
                    } else if (result.size() > 0) {
                        if (nums[i] != (target - nums[result.get(0)])) continue;
                        else result.add(i);
                    } else {
                        result.add(i);
                    }
                }
            }
        }
        return result;
    }

}
