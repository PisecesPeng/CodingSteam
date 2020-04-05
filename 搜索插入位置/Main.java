public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 5, 6};
        int num = 0;
        System.out.println(func(ints, num));
    }

    private static int func(int[] ints, int num) {
        int length = nums.length;
        if (length < 1) return 0;
        if (nums[0] >= target) return 0;
        
        int i = 1;
        while (i < length) {
            if (nums[i] < target) {  // 如果数组值小于target, 则累加i, 继续循环
                if (i + 2 < length) i += 2;  // 一次向右增加两个下标
                else i += 1;
            } else {
                // 当且仅当数组值大于target时候
                // 判断前一个下标(由于数组可能一次增加2个下标)是否同样大于target
                if (nums[i - 1] >= target) return i - 1;
                else return i;
            }
        }
        return i;
    }

}
