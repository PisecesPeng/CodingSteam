public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(1011));
    }

    private static int func(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);  // use binary computing
        }
        return sum;
    }

}
