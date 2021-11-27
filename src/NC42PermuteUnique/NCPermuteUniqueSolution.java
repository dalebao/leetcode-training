package NC42PermuteUnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class NCPermuteUniqueSolution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        if (num.length == 0) {
            return res;
        }
        Arrays.sort(num);
        LinkedList<Integer> trace = new LinkedList<>();
        int[] mark = new int[num.length];
        dfs(num, trace, mark);
        return res;
    }

    void dfs(int[] num, LinkedList<Integer> trace, int[] mark) {
        if (trace.size() == num.length) {
            res.add(new ArrayList<>(trace));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            // mark[i] == 1  说明已经被使用
            // num[i] == num[i-1] 时，如果 num[i-1] == 0 说明 已经在回溯中被使用
             if (mark[i] == 1 || i > 0 && num[i] == num[i - 1] && mark[i - 1] == 0) {
                continue;
            }
            trace.addLast(num[i]);
            mark[i] = 1;
            dfs(num, trace, mark);
            trace.removeLast();
            mark[i] = 0;
        }
    }
}
