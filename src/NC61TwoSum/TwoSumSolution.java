package NC61TwoSum;

import java.util.HashMap;

public class TwoSumSolution {

    public int[] twoSum(int[] numbers, int target) {
        // write code here
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        HashMap<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (r.containsKey(numbers[i])) {
                res[0] = r.get(numbers[i]);
                res[1] = i;
            }
            r.put(target - numbers[i], i);
        }
        return res;
    }
}
