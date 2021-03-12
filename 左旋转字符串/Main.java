public class Main {

    public static void main(String[] args) {
        func("abcdefg", 2);
    }

    private static String func(String s, int n) {
        char[] chars = s.toCharArray();
        return new StringBuilder()
                .append(chars, n, s.length() - n)
                .append(chars, 0, n)
                .toString();
    }

}
