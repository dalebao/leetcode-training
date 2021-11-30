package NC121Permutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class NCPermutationSolution {
    ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> record = new HashSet<>();
        dfs(str, sb, record);
        return res;
    }

    void dfs(String str, StringBuilder sb, HashSet<Integer> record) {

        if (str.length() == sb.length() && !res.contains(sb.toString())) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (record.contains(i)) {
                continue;
            }
            record.add(i);
            sb.append(str.charAt(i));
            dfs(str, sb, record);
            sb.deleteCharAt(sb.length() - 1);
            record.remove(i);
        }

    }
}
