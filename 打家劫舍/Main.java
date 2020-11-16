public class Main {

    // 未测试
    public static void main(String[] args) {
        int[] ints = new int[]{2, 7, 9, 3, 1, 8, 1};
        System.out.println(func(ints));
    }

    /**
     * 错误理解了题目的含义, 以为小偷可以隔1户或隔多户进行盗窃
     */
    private static int func(int[] ints) {
        if (ints.length < 1) return 0;
        if (ints.length < 2) return ints[0];
        return Math.max(fun1(ints, 0, ints[0])
                , fun1(ints, 1, ints[1]));
    }

    private static int fun1(int[] ints, int idx, int result) {
        // 获得 间隔多户的盗窃金额比较, 取最大返回
        if (idx + 2 >= ints.length)
            return result;
        if (idx + 3 < ints.length)
            return Math.max(fun1(ints, idx + 2, result + ints[idx + 2])
                    , fun1(ints, idx + 3, result + ints[idx + 3]));
        return fun1(ints, idx + 2, result + ints[idx + 2]);
    }

}
