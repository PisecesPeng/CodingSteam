public class Main {

    public static void main(String[] args) {
        String s = " -987 words and 987 ";
        System.out.println(func(s));
    }

    private static int func(String str) {
        int length = str.length();
        int index = 0;
        boolean isMinus = false;  // 是否为负数
        // 去除空格
        while (index < length && str.charAt(index) == ' ') {
            index++;
        }
        // 判断是否为负数
        if (index < length && str.charAt(index) == '+') {
            index++;
        } else if (index < length && str.charAt(index) == '-') {
            isMinus = true;
            index++;
        }
        int result = 0;
        // 获取数字, 并判断是否超过最大值/最小值
        while (index < length && Character.isDigit(str.charAt(index))) {
            int v = str.charAt(index++) - '0';
            if (isMinus && result > (Integer.MAX_VALUE - v) / 10) {
                return Integer.MIN_VALUE;
            } else if (!isMinus && result > (Integer.MAX_VALUE - 1 - v) / 10) {
                return Integer.MAX_VALUE;
            }
            result = result * 10 + v;
        }
        return isMinus ? -result : result;
    }

}
