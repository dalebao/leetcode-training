package OfferNo081CombinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumSolution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> trace = new LinkedList<>();
        dfs(candidates, 0, target, trace);
        return res;
    }

    void dfs(int[] candidates, int k, int target, LinkedList<Integer> trace) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(trace));
        }

        for (int i = k; i < candidates.length; i++) {
            trace.addLast(candidates[i]);
            dfs(candidates, k, target - candidates[i], trace);
            trace.removeLast();
        }
    }
}
