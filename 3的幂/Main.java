public class Main {

    public static void main(String[] args) {
        func(1);
    }

    private static boolean func(int n) {
        if (n <= 0) return false;
        long three = 81l;
        while (three < n)  // 尽快超过入参
            three *= 81l;
        while (three > n)  // 尽量接近入参
            three /= 3l;
        if (three == n) return true;
        else return false;
    }

}