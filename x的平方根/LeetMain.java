public class LeetMain {

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(func(x));
    }

    private static int func(int x) {
        // 通过二分法, 找出最接近x值的那个数
        if (x < 2) return x;
        long num;
        int pivot, left = 2, right = x / 2;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long) pivot * pivot;
            if (num > x) right = pivot - 1;
            else if (num < x) left = pivot + 1;
            else return pivot;
        }
        return right;
    }

}
