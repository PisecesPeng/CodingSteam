public class LeetMain {

    public static void main(String[] args) {
        func(1);
    }

    private static boolean func(int n) {
        return Integer.toString(n, 3).matches("^10*$");
    }

}
