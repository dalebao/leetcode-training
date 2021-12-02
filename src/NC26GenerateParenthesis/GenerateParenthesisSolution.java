package NC26GenerateParenthesis;

import java.util.ArrayList;

public class GenerateParenthesisSolution {

    ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> generateParenthesis(int n) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder();
        dfs(n, stringBuilder, 0, 0);
        return res;
    }

    void dfs(int n, StringBuilder stringBuilder, int left, int right) {
        if (stringBuilder.length() == 2 * n) {
            res.add(stringBuilder.toString());
            return;
        }

        if (left < n) {
            stringBuilder.append("(");
            dfs(n, stringBuilder, left + 1, right);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        if (right < left) {
            stringBuilder.append(")");
            dfs(n, stringBuilder, left, right + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

    }

}
