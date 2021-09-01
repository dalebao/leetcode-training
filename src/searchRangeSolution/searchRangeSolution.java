package searchRangeSolution;

public class searchRangeSolution {


    public static void main(String[] args) {

    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == nums[end]) {
                return new int[]{start, end};
            }
            if (nums[start] < target) {
                start++;
            }
            if (nums[end] > target) {
                end--;
            }
        }
        return new int[]{-1, -1};
    }

}
