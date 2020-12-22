import java.util.Arrays;

public class LeetMain {

    public static void main(String[] args) {
        func(499979);
    }

    private static int func(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {  // 将数据的倍数均赋值
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

}
