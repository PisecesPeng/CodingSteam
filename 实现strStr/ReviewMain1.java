import java.util.Objects;

public class ReviewMain1 {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(func(haystack, needle));
    }

    private static int func(String haystack, String needle) {
        if ((needle == null || "".equals(needle.trim()))  // 判断'匹配字符串'是否为空
                || haystack.equals(needle)  // 判断两字符串是否相等
        ) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)
                    && haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

}
