public class Main {

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(func(x));
    }

    private static int func(int x) {
        if (x < 2) return x;

        // 通过二分法, 找出最接近x值的那个数
        long left = 0, right = x, m = (left + right) / 2;
        while (true) {
            long rTmp = m * m;
            if (rTmp == x) {
                return Long.valueOf(m).intValue();
            } else if (rTmp > x) {
                right = m;
                m = (left + right) / 2;
            } else {
                long pTmp = (m + 1) * (m + 1);
                if (pTmp == x) return Long.valueOf(m + 1).intValue();
                else if (pTmp > x) return Long.valueOf(m).intValue();
                else {
                    left = m;
                    m = (left + right) / 2;
                }
            }
            if (left >= right - 1) return 0;
        }
    }

}
