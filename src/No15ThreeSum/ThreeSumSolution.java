package No15ThreeSum;

import java.util.*;

public class ThreeSumSolution {

    List<List<Integer>> res = new ArrayList<>();
    Set<String> resSet = new HashSet<>();

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> chosen = new LinkedList<>();
        dfs(nums, 0, 0, chosen);
        return res;
    }

    void dfs(int[] nums, int start, int target, LinkedList<Integer> chosen) {
        if (target < 0) {
            return;
        }
        if (chosen.size() > 3) {
            return;
        }
        if ((chosen.size() == 3) && target == 0) {
            StringBuilder a = new StringBuilder();
            for (Integer integer : chosen) {
                a.append(integer);
            }
            if (resSet.contains(a.toString())) {
                return;
            }
            res.add(new ArrayList<>(chosen));
            resSet.add(a.toString());
            return;
        }

        for (int i = start; i < nums.length; i++) {
            chosen.addLast(nums[i]);
            dfs(nums, i+1, target - nums[i], chosen);
            chosen.removeLast();
        }

    }
}
