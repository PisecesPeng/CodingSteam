public class Main {

    public static void main(String[] args) {
        func(0b00000010100101000001111010011100);
    }

    private static int func(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n)).reverse();
        sb = sb.reverse();
        while (sb.length() < 32)
            sb.append("0");
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }

}