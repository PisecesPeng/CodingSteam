import java.util.HashMap;

public class LeetMain {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(func(s));
    }

    private static int func(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // 循环, 将每个字母出现的次数统计
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // 找到第一个只出现一次的字母下标
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

}
