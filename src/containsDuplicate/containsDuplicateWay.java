package containsDuplicate;

import java.util.HashMap;

public class containsDuplicateWay {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(containsDuplicate2(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Object> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                return true;
            }
            res.put(nums[i], new Object());
        }
        return false;

    }

    public static boolean containsDuplicate2(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}


