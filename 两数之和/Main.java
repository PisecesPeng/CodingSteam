import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 数组与目标值
        int[] nums = new int[]{2, 8, 11, 7, 7, 2, 10, -1, 9, 0};
        int target = 9;

        func(nums, target).forEach(x -> System.out.println(x));
    }

    private static List<String> func(int[] nums, int target) {
        // 记录下标
        List<String> result = new ArrayList<>();

        int freq = 0;
        while (true) {
            int index1 = 0;  // 记录下标, 每次循环重置
            int index2 = 0;  // 记录下标, 每次循环重置
            boolean flag = false;  // 记录是否为重复下标flag, 每次循环重置

            for (int i = freq + 1; i < nums.length; i++) {  // 循环数组, 从'循环次数+1'开始遍历数组
                if ((nums[freq] + nums[i]) == target) {  // 判断两下标是否符合条件
                    index1 = freq;
                    index2 = i;
                    flag = true;
                }
                if (flag) {  // 判断是否为重复下标
                    result.add(index1 + " : " + index2);  // 记录符合条件的下标
                    flag = false;  // 重置记录是否为重复下标flag
                }
            }

            // 判断循环次数是否超过数组长度
            if (nums.length - 1 <= freq) break;
            else freq++;
        }

        return result;
    }

}
