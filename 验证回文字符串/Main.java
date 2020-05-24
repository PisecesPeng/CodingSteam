public class Main {

    public static void main(String[] args) {
        String s = ".,";
        System.out.println(func(s));
    }

    private static boolean func(String s) {
        s = s.toLowerCase();  // 将s全部转换为小写, 后续不一一转换比较
        int pre = 0, post = s.length() - 1;  // 双指针法
        while (pre < post) {
            while (judgeDigitOrLetter(s.charAt(pre)) && pre < post) {
                pre++;
            }
            while (judgeDigitOrLetter(s.charAt(post)) && pre < post) {
                post--;
            }
            if (s.charAt(pre) != s.charAt(post)) return false;
            pre++; post--;
        }
        return true;
    }

    // 是否为数字或小写字母
    private static boolean judgeDigitOrLetter(char c) {
        return !Character.isDigit(c) && !Character.isLowerCase(c);
    }

}
