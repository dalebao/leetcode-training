package No46Permute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermuteSolution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> trace = new LinkedList<>();
        backtrack(nums, trace);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> trace) {
        if (trace.size() == nums.length) {
            res.add(new ArrayList<>(trace));
        }
        for (int num : nums) {
            if (trace.contains(num)) {
                continue;
            }
            trace.addLast(num);
            backtrack(nums, trace);
            trace.pollLast();
        }

    }
}
