public class Main {

    public static void main(String[] args) {
        func(499979);
    }

    private static int func(int n) {
        if (n <= 2) return 0;
        if (n <= 3) return 1;
        if (n <= 5) return 2;
        if (n <= 7) return 3;
        if (n <= 8) return 4;

        int[] arr = new int[n];
        int m = 1;
        int idx = 0;
        while (n > (idx = 2 * (++m)))  // 先将所有2的倍数赋值
            arr[idx] = 1;
        for (int i = 3; (i * 2) < n; i += 2) {
            m = 1;
            while (n > (idx = i * (++m)))  // 将数据的倍数均赋值
                arr[idx] = 1;
        }
        int r = 4;
        for (int i = 11; i < arr.length; i++) {  // 将所有未被赋值的数组累计
            if (arr[i] == 0) r++;
        }
        return r;
    }

}