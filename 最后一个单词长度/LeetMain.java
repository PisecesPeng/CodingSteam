public class LeetMain {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.printf(String.valueOf(func(str)));
    }

    private static int func(String str) {
        int end = str.length() - 1;
        while (end >= 0 && str.charAt(end) == ' ') end--;  // 先排除末尾存在空格的情况, 从后往前得到第一个非空格下标
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && str.charAt(start) != ' ') start--;  // 找到最后一个单词前的空格下标
        return end - start;
    }

}
