public class LeetMain {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(func(haystack, needle));
    }

    private static int func(String haystack, String needle) {
        int hLen = haystack.length(), nLen = needle.length();
        for (int i = 0; i <= hLen - nLen; i++) {  // 等于, 适用于两者相等的情况下(包含"")
            int j = 0;
            for (; j < nLen; j++) {
                // 判断'被匹配下标字符'是否和'匹配的字符'相等
                // 若相等, 即可实现j的累加
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen) {  // 当且仅当j累加的长度于匹配字符串长度相等时
                return i;
            }
        }
        return -1;
    }

}
