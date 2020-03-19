import java.util.Objects;

public class ReviewMain1 {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(func(haystack, needle));
    }

    private static int func(String haystack, String needle) {
        if (needle == null || "".equals(needle.trim())) return 0;  // 判断'匹配字符串'为空的情况
        char c = needle.charAt(0);
        for (int i = 0, hayLen = haystack.length(), neeLen = needle.length(); i < hayLen; i++) {
            // 遍历, 取得符合条件的下标
            if (Objects.equals(haystack.charAt(i), c) &&
                    haystack.substring(i, i + neeLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
