public class Main {

    public static void main(String[] args) {
        System.out.println(func(new int[]{3, 0, 1}));
    }

    private static int func(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += (i + 1) - nums[i];
        return sum;
    }

}
