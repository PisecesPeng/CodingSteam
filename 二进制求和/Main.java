public class Main {

    public static void main(String[] args) {
        String a = "11", b = "1";
        func(a, b);
    }

    private static String func(String a, String b) {
        int rTmp = Integer.valueOf(a).intValue() + Integer.valueOf(b).intValue();
        String result = "";
        boolean plusOne = false;  // '是否进位'状态
        while (rTmp > 0) {
            int r = rTmp % 10;  // 取得个位数
            // 判断当前个位数, 且判断'是否进位', 向前累加值, 并更新'是否进位'状态
            if (r == 0) {
                if (plusOne) result = "1" + result;
                else result = "0" + result;
                plusOne = false;
            } else if (r == 1) {
                if (plusOne) result = "0" + result;
                else result = "1" + result;
            } else {
                if (plusOne) result = "1" + result;
                else result = "0" + result;
                plusOne = true;
            }
            rTmp /= 10;
        }
        // 确认首位是否还需要进位
        if (plusOne) result = "1" + result;
        return result;
    }

}
