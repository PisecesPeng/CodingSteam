public class Main {

    public static void main(String[] args) {
        func(12258);
    }

    public static int func(int num) {
        if (num < 10) return 1;
        String str = String.valueOf(num);
        return rec(num, str.length());
    }

    private static int rec(int i, int length) {
        if (length == 0) return 1;
        int r = rec(i % ((int) Math.pow(10, length - 1)), length -1);
        if (length > 1) {
            int tmp = i / ((int) Math.pow(10, length - 2));
            if (tmp >= 10 && tmp <= 25) {
                r += rec(i % ((int) Math.pow(10, length - 2)), length - 2);
            }
        }
        return r;
    }

}
