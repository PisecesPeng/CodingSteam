import java.util.HashMap;
import java.util.Map;

public class LeetMain {

    public static void main(String[] args) {

        // 罗马数字
        String str = "MCMXCIV";

        System.out.println(func(str));
    }

    private static int func(String str) {
        // 初始化所有的罗马数字对应数值
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int ans = 0;
        for (int i = 0; i < str.length(); ) {
            if (i + 1 < str.length() && map.containsKey(str.substring(i, i + 2))) {  // 判断是否存在两个罗马数字的组合
                ans += map.get(str.substring(i, i + 2));  // 取得组合罗马数字的数值, 并index加两位
                i += 2;
            } else {
                ans += map.get(str.substring(i, i + 1));  // 取得单个罗马数字的数值, 并index加一位
                i++;
            }
        }
        return ans;
    }

}
