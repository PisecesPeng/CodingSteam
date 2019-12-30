import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetMain {

    public static void main(String[] args) {

        // 数组与目标值
        int[] nums = new int[]{2, 8, 11, 7, 7, 2, 10, -1, 9, 0};
        int target = 9;

        func(nums, target).forEach(x -> System.out.println(x));
    }

    private static List<String> func(int[] nums, int target) {
        // 记录下标
        List<String> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();  // 若遇到数组中存在重复值时, 且将符合需求的下标全部返回时, 可能会有点问题
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result.add(map.get(complement) + " : " + i);
            }
            map.put(nums[i], i);
        }

        return result;
    }

}
