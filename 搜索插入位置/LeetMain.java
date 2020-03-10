public class LeetMain {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 5, 6};
        int num = 0;
        System.out.println(func(ints, num));
    }

    private static int func(int[] ints, int num) {
        int len = ints.length;
        if (len == 0) return 0;
        // 特判
        if (ints[len - 1] < num) return len;
        int left = 0;
        int right = len;
        while (left < right) {
            int mid = (left + right) >>> 1;
            // 小于num的元素一定不是解(存在最后跳出while循环的情况)
            if (ints[mid] < num) {
                // 下一轮搜索区间是[mid + 1, right]
                left = mid + 1;
            } else {
                // 下一轮搜索区间是[left, mid]
                right = mid;
            }
        }
        return left;
    }

}
