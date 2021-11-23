package No22GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisSolution {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        dfs(new StringBuilder(), 0, 0, n);
        return res;
    }

    void dfs(StringBuilder sb, int left, int right, int max) {
        if (sb.length() == 2 * max) {
            res.add(new String(sb.toString()));
            return;
        }

        // 左括号 小于 max 就能继续选择
        if (left < max) {
            sb.append("(");
            dfs(sb, left + 1, right, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        // 右括号 小于 左括号 就能继续选择
        if (right < left) {
            sb.append(")");
            dfs(sb, left, right + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
