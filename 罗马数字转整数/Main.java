public class Main {

    public static void main(String[] args) {

        // 罗马数字
        String str = "MCMXCIV";

        System.out.println(func(str));
    }

    private static int func(String str) {
        // 若不存在罗马数字, 则默认返回0
        if (null == str || "".equals(str)) return 0;

        // 将字符串转换为单个字符
        String[] strArray = str.split("");

        int result = 0;
        if (1 == strArray.length) {  // 有且仅有一个字符时候, 直接输出其数值
            return IntEnum.valueOf(strArray[0]).getNum();
        }
        for (int i = 1; i < strArray.length; i++) {  // 从第二位开始计算, 是为了保证可以每次能够与前一位大小比较
            int intenumValue = IntEnum.valueOf(strArray[i]).getNum();  // 获得当前罗马数字的数值
            int intenumPreValue = IntEnum.valueOf(strArray[i - 1]).getNum();  // 获得前一个罗马数字的数值
            if (intenumPreValue < intenumValue) {  // 是否存在前一位数值比当前数值小的情况
                result += intenumValue - intenumPreValue;  // 若存在前一位数值比当前数值小, 需要取得该两位数值的差
                i++;  // 由于此次计算已使用两个数字, 跳一位, 保证不重复使用数字
                // 当此次循环为最后一次循环时, 将最后一位数值也累加上
                if (i == strArray.length - 1) result += IntEnum.valueOf(strArray[i]).getNum();
            } else {
                result += intenumPreValue;  // 正常累加result数值
                // 当此次循环为最后一次循环时, 将最后一位数值也累加上
                if (i == strArray.length - 1) result += intenumValue;
            }
        }
        return result;
    }

    // 数值对应枚举
    enum IntEnum {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000),
        ;

        int num;

        IntEnum(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }
    }
}
