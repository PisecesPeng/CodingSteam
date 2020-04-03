public class LeetMain {

    public static void main(String[] args) {
        String a = "11", b = "1";
        func(a, b);
    }

    private static String func(String a, String b) {
        int n = a.length(), m = b.length();
        if (n < m) return func(b, a);
        int L = Math.max(n, m);

        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;
        for (int i = L - 1; i > -1; i--) {
            // 字符串是否存在'1', 若是存在, 则累加carry
            if (a.charAt(i) == '1') ++carry;
            if (j > -1 && b.charAt(j--) == '1') ++carry;
            // 判断carry的值, 从而判断本次应该累加'0'或'1'
            if (carry % 2 == 1) sb.append('1');
            else sb.append('0');
            // 确认消耗carry的值, 并重制
            carry /= 2;
        }
        // 确认最后一位是否还需要进位
        if (carry == 1) sb.append('1');
        sb.reverse();

        return sb.toString();
    }

}
