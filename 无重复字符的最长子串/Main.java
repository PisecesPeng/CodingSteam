import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(func(s));
    }

    private static int func(String s) {
        if (Objects.isNull(s) || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            // 判断字符是已存在
            if (!set.add(s.charAt(i))) {
                // 取得当前不重复字符长度
                result = Math.max(result, set.size());
                set.clear();
                // 左指针右移
                i = j++;
            }
        }
        return Math.max(result, set.size());
    }

}
