public class Main {

    public static void main(String[] args) {
        char[] s = new char[]{'A', 'b', 'c', 'd', 'e', 'f'};
        func(s);
    }

    private static void func(char[] s) {
        // 循环交换
        for (int i = 0, lastIdx = s.length - 1; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[lastIdx - i];
            s[lastIdx - i] = tmp;
        }
    }

}
