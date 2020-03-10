public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 5, 6};
        int num = 0;
        System.out.println(func(ints, num));
    }

    private static int func(int[] ints, int num) {
        if (ints.length < 1) return 0;
        if (ints[0] >= num) return 0;
        if (ints[ints.length - 1] <= num) return ints.length;
        
        int i = 1;
        while (i < ints.length) {
            if (ints[i] < num) {  // 如果数组值小于num, 则累加i, 继续循环
                if (i + 2 < ints.length) i += 2;  // 一次向右增加两个下标
                else i += 1;
            } else {
                // 当且仅当数组值大于num时候
                // 判断前一个下标(由于数组可能一次增加2个下标)是否同样大于num
                if (ints[i - 1] >= num) return i - 1;
                else return i;
            }
        }
        return i;
    }

}
