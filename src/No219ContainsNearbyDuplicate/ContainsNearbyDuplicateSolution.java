package No219ContainsNearbyDuplicate;

import java.util.Arrays;

public class ContainsNearbyDuplicateSolution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        int j = 1;

        for (int i = 0; i < len; i++) {
            while (j <= k && i+j < len){
                if (nums[i] == nums[i+j]){
                    return true;
                }
                j ++;
            }
        }
        return false;
    }
}
