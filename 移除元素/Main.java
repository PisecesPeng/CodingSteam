import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int cutIndex = func(ints, 2);
        System.out.println(cutIndex);

        for (int i = 0; i < cutIndex; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int func(int[] ints, int val) {
        if (Objects.isNull(ints)) return 0;  // 若数组为null, 则直接返回
        int cutIndex = 0;  //
        int valSize = 0;  // val值存在的个数
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == val) {  // 若值等于val, 则增加valSize
                valSize++;
            } else {
                cutIndex++;  // 增加数组(非val值)的长度
                if (valSize > 0)  // 若是已出现过val值, 则将余下的值往前移'valSize'个下标
                    ints[i - valSize] = ints[i];
            }
        }
        return cutIndex;
    }

}
