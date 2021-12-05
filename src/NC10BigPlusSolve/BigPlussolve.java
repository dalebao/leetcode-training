package NC10BigPlusSolve;

import java.util.ArrayList;
import java.util.List;

public class BigPlussolve {

    public String solve(String s, String t) {
        // write code here
        int sL = s.length() - 1;
        int tL = t.length() - 1;
        StringBuilder res = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        String base = "";
        while (tL > 0) {
            int tN = t.charAt(tL) - '0';
            int tmp = 0;
            String o = "";
            for (int i = sL; i > 0; i--) {
                int sN = s.charAt(sL) - '0';
                int r = tN * sN + tmp;
                o = r % 10 + o;
                tmp = r / 10;
            }
            stringList.add(o + base);
            base = base + "0";
            tL--;
        }
        String b = stringList.get(0);
        for (int i = 1; i < stringList.size(); i++) {

        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "0192";
        System.out.println(s.charAt(2) - '0' + 1);
    }
}
