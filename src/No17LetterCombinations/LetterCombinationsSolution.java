package No17LetterCombinations;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsSolution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        for (int j = 0; j < 3; j++) {
//            res.add();
            for (int i = 0; i < digits.length(); i++) {
                char r = digits.charAt(i);
                int start = 97 + 3 * (Integer.valueOf(r));
//                res.get(j) += (char) (start + j);
            }

        }


        return null;
    }

    public static void main(String[] args) {

    }
}
