public class Main {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.printf(String.valueOf(func(str)));
    }

    private static int func(String str) {
        int r = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            // 从后向前循环, 遇到第一个空格直接返回结果
            if (' ' == str.charAt(i)) break;
            r++;
        }
        // 若不存在空格, 则返回0
        if (r == str.length() - 1) return 0;
        return r;
    }

}
