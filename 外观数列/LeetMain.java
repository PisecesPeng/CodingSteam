public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(5));
    }

    private static String func(int n) {
        String s = "1";
        for (int i = 2; i <=n ; i++) {
            StringBuilder builder = new StringBuilder();
            char pre = s.charAt(0);  // 将首个字符作为默认值去比较接下来的字符
            int count = 1;  // 连续出现的字符数
            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == pre) {  // 若前后字符相等, 暂时不做累计操作
                    count++;
                } else {  // 若前后字符串不等, 则进行累计操作, 并重制字符默认值和累计字符数
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            s = builder.toString();
        }
        return s;
    }

}
