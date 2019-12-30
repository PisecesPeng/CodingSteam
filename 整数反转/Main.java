public class Main {

    public static void main(String[] args) {

        // 反转32位整数
        int num = -1750912899;

        System.out.println(func(num));
    }

    private static int func(int num) {

        String numStr = String.valueOf(num);
        boolean isNegative = false;  // 记录入参是否为负数

        if (numStr.startsWith("-")) {  // 判断入参是否为负数
            // 记录入参数为负数, 并截取负数后的数字
            isNegative = true;
            numStr = numStr.substring(1);
        }
        if (numStr.length() == 1) return num;

        char[] numChar = numStr.toCharArray();
        int length = numChar.length;
        int maxIndex = length % 2 != 0 ? (length - 1) / 2 : length / 2;  // 根据整数长度决定循环的次数
        for (int i = 0; i < maxIndex; i++) {
            // swap
            char c = numChar[i];
            numChar[i] = numChar[length - 1 - i];
            numChar[length - 1 - i] = c;
        }

        numStr = String.valueOf(numChar);
        if (isNegative) {  // 判断是否为负数
            numStr = "-" + numStr;
        }

        try {
            // 使用Integer自带方法转换为整型, 若异常则返回相应内容
            num = Integer.valueOf(numStr).intValue();
            return num;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
