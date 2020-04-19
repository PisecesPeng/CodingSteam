public class LeetMain {

    public static void main(String[] args) {
        char[] s = new char[]{'A', 'b', 'c', 'd', 'e', 'f'};
        func(s);
    }

    public static void func(char[] s) {
        helper(s, 0, s.length - 1);  // 递归
    }

    public static void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

}
