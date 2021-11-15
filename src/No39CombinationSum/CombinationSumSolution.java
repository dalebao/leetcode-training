package No39CombinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumSolution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> path = new LinkedList<>();
        dfs(candidates, 0, target, path);
        return res;
    }

    public void dfs(int[] candidates, int k, int target, LinkedList<Integer> path) {
        if (target < 0) {
            return;
        }
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = k; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            dfs(candidates, i, target-candidates[i], path);
            path.removeLast();
        }
    }
}
