public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(44));
    }

    private static int func(int n) {
        // 动态规划
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}

