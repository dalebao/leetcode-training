package No77Combine;

import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombineSolution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k == 0 || n == 0) {
            return res;
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        LinkedList<Integer> trace = new LinkedList<>();
        backtrack(nums, k, 0, trace);
        return res;
    }

    void backtrack(int[] nums, int k, int start, LinkedList<Integer> trace) {
        if (trace.size() == k) {
            res.add(new ArrayList<>(trace));
        }

        for (int i = start; i < nums.length; i++) {
            trace.addLast(nums[i]);
            backtrack(nums, k, i + 1, trace);
            trace.removeLast();
        }
    }
}
