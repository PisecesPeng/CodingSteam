import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(func(s));
    }

    private static int func(String s) {
        // 保存结果, k为字符, v为字符下标
        Map<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0, length = chars.length; i < length; i++)
            // 当且仅当 map 中不存在k, 设置其下标值, 若存在, 则将v设置为-1
            map.merge(String.valueOf(chars[i]), i, (oldVal, newVal) -> -1);

        // 将v大于等于0, 且下标值为最小的 取出
        return map.values().stream()
                .filter(x -> x >= 0)
                .min(Comparator.comparing(Integer::intValue))
                .orElse(-1);
    }

}
