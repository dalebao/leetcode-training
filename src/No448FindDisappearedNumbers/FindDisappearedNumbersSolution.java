package No448FindDisappearedNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbersSolution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> r = new ArrayList<>();
        Arrays.sort(nums);
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != j) {
                if (nums[i] < j) {
                    r.add(j);
                    i++;
                } else {
                    j++;
                }
            } else {
                j++;
            }
        }
        return r;
    }
}
