public class Main {

    public static void main(String[] args) {
        System.out.println(func("We are happy."));
    }

    private static String func(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray())
            stringBuilder.append(c == ' ' ? "%20" : c);
        return stringBuilder.toString();
    }

//    private static String func(String str) {
//        return str.replace(" ", "%20");
//    }

}
