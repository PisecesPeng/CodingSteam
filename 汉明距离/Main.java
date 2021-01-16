public class Main {

    public static void main(String[] args) {
        System.out.println(func(12, 6));
    }

    private static int func(int x, int y) {
        if (x == 0 && x == y) return 0;
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        int count = 0;
        for (int i = 0; i < s1.length() - s2.length(); i++)
            if (s1.charAt(i) == '1') count++;
        s1 = s1.substring(s1.length() - s2.length());
        for (int i = 0; i < s2.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) count++;
        return count;
    }

}