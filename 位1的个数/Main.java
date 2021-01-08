public class Main {

    public static void main(String[] args) {
        System.out.println(func(1011));
    }

    private static int func(int n) {
        int count = 0;
        for (char c : String.valueOf(n).toCharArray())
            if ('1' == c) count++;
        return count;
    }

}
