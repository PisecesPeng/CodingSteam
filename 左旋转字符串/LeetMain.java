public class LeetMain {

    public static void main(String[] args) {
        func("abcdefg", 2);
    }

    private static String func(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();
    }

}
