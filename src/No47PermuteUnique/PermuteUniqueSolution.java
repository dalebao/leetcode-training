package No47PermuteUnique;

import java.util.*;

public class PermuteUniqueSolution {

    List<List<Integer>> res = new ArrayList<>();
    Set<String> set = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        LinkedList<Integer> trace = new LinkedList<>();
        Set<Integer> seti = new HashSet<>();
        backtrack(nums,  trace, seti);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> trace, Set<Integer> seti) {
        if (trace.size() == nums.length) {
            List<Integer> r = new ArrayList<>(trace);
            StringBuilder a = new StringBuilder();
            for (Integer integer : trace) {
                a.append(integer);
            }
            if (!set.contains(a.toString())) {
                res.add(r);
                set.add(a.toString());
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (seti.contains(i)) {
                continue;
            }
            trace.addLast(nums[i]);
            seti.add(i);
            backtrack(nums, trace, seti);
            trace.removeLast();
            seti.remove(i);
        }
    }

    public static void main(String[] args) {
        PermuteUniqueSolution permuteUniqueSolution = new PermuteUniqueSolution();
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        permuteUniqueSolution.permuteUnique(nums);
        System.out.println(permuteUniqueSolution.res);
    }
}
