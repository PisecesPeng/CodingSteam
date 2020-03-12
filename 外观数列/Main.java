import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println(func(5));
    }

    private static String func(int n) {
        String s = "1";
        for (int j = 1; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                // 若i为最后一个下标, 则直接返回"1"+"下标值"
                if ((i + 1) >= s.length()) sb.append("1").append(s.charAt(i));
                else {
                    int combo = 1;  // 连续出现的字符数
                    // 在i不超过最大长度前提下, 一直向后查找相同的字符
                    while ((i + 1) < s.length() && Objects.equals(s.charAt(i), s.charAt(i + 1))) {
                        i++;
                        combo++;
                    }
                    sb.append(combo).append(s.charAt(i));
                }
            }
            s = sb.toString();
        }
        return s;
    }

}
