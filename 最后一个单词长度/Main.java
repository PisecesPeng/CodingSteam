public class Main {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.printf(String.valueOf(func(str)));
    }

    private static int func(String str) {
        if (str.length() == 0) return 0;
        // 去除最右边的' '字符
        int index = str.length() - 1;
        while (index >= 0 && ' ' == str.charAt(index)) --index;
        str = str.substring(0, index + 1);
        int length = str.length();

        int r = 0;
        for (int i = length - 1; i >= 0; i--) {
            // 从后向前循环, 遇到第一个空格直接返回结果
            if (' ' == str.charAt(i)) break;
            r++;
        }
        // 若不存在空格, 则返回字符串本身长度
        if (r == 0) return length;
        return r;
    }

}
