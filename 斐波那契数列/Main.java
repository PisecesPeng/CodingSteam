public class Main {

    public static void main(String[] args) {
        System.out.println(func(99));
    }

    private static int func(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int tmp1 = 0, tmp2 = 1;
        for (int idx = 2; idx <= n; idx++) {
            tmp2 = tmp2 + tmp1;
            tmp1 = tmp2 - tmp1;
            if (tmp2 > 1000000007) tmp2 -= 1000000007;
        }
        return tmp2;
    }

}
