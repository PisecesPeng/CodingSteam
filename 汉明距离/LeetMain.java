public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(12, 6));
    }

    private static int func(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
