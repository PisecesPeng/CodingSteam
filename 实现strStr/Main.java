public class Main {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(func(haystack, needle));
    }

    private static int func(String haystack, String needle) {
        if (needle == null || "".equals(needle.trim())) return 0;  // 判断'匹配字符串'为空的情况
        String[] strs = haystack.split(needle);
        if (strs.length == 0) return 0;  // 当 两字符串相同时, 数组为空
        if (strs[0].length() == haystack.length()) return -1;  // 当 数组[0]字符串长度为'被匹配字符串'长度时, 说明未匹配上
        return strs[0].length();
    }

}
