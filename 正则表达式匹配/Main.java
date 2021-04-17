public class Main {

    public static void main(String[] args) {
        String s = "";
        String p = ".";
        System.out.println(func(s, p));
    }

    private static boolean func(String s, String p) {
        String r = s.replaceFirst(p, "#");
        return r.contains("#") && r.chars().filter(x -> x != '#').sum() == 0;
    }

}
