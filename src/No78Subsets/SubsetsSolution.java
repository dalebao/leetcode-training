package No78Subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubsetsSolution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> stack = new LinkedList<>();
        backtrack(nums,0,stack);
        return res;
    }

    void backtrack(int[]nums,int start,LinkedList<Integer> stack){
        res.add(new ArrayList<>(stack));
        for (int i = start; i < nums.length; i++) {
            stack.addLast(nums[i]);
            backtrack(nums,i + 1,stack);
            stack.pollLast();
        }
    }

}
