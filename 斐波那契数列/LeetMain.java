public class LeetMain {

    public static void main(String[] args) {
        System.out.println(func(99));
    }

    private static int func(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
