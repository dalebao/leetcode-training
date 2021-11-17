package No33Search;

import java.util.Arrays;

public class SearchSolution {

    public int search(int[] nums, int target) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                k = i;
                break;
            }
        }
        //(0-k) // (k+1,length-1)
        int left = 0;
        int right = 0;
        if (target == nums[k]) {
            return k;
        }
        if (target < nums[0]) {
            left = k + 1;
            right = nums.length - 1;
        } else {
            right = k;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
