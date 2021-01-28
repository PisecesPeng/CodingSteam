import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(func(5));
    }

    private static List<List<Integer>> func(int numRows) {
        if (numRows == 0)
            return new ArrayList<>();
        int[] fill = new int[numRows];
        fill[0] = 1;
        List<List<Integer>> r = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            int[] fillTmp = Arrays.copyOf(fill, fill.length);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                    fill[j] = 1;
                } else {
                    int tmp = fillTmp[j] + fillTmp[j - 1];
                    list.add(tmp);
                    fill[j] = tmp;
                }
            }
            r.add(list);
        }
        return r;
    }

}