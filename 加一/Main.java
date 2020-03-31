public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 9, 9, 9};
        func(nums);
    }

    private static int[] func(int[] nums) {
        int[] numsbackup = new int[nums.length + 1];  // 设置备用的结果数组
        numsbackup[0] = 1;  // 将其首位设置为1, 因为(9+1)进一位, 故首位一定是1
        for (int i = nums.length - 1, j = numsbackup.length - 1; i >= 0; i--, j--) {
            if (nums[i] < 9) {  // 数组数字小于9, 说明不会再向前进位
                nums[i] += 1;
                numsbackup[j] = nums[i];
                break;
            } else if (nums[i] == 9) {  // 数组数字等于9, 说明还会继续向前进位
                nums[i] = 0;
                numsbackup[j] = nums[i];
            }
        }
        if (nums[0] == 0) return numsbackup;  // 如果数组的第一位为0, 则说明其原值为9, 故输出备用结果
        else return nums;
    }

}
