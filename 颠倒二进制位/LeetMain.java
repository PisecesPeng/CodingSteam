public class LeetMain {

    public static void main(String[] args) {
        func(0b00000010100101000001111010011100);
    }

    private static int func(int n) {
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            res = res << 1;
            res = n & 1 | res;
            n = n >> 1;
        }
        return res;
    }

}
