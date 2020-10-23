public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(2126753390));
    }

    private static int func(int n) {
        // 采用二分法查找
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isBadVersion(int i) {
        if (i >= 1702766719) return true;
        else return false;
    }

}

