public class Main {

    public static void main(String[] args) {
        System.out.println(func(2126753390));
    }

    private static int func(int n) {
        if (n < 2) return n;
        // 采用二分法查找
        int right = n, left = 1, mid = right / 2;
        while ((right - left) > 1) {
            boolean isBadVersion = isBadVersion(mid);
            // 二分定位 值所在区间
            if (isBadVersion)
                mid = ((right = mid) + left) >>> 1;
            else
                mid = ((left = mid) + right) >>> 1;
        }
        return isBadVersion(left) ? left : left + 1;
    }

    private static boolean isBadVersion(int i) {
        if (i >= 1702766719) return true;
        else return false;
    }

}



