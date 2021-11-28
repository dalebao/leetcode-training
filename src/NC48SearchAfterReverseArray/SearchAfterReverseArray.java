package NC48SearchAfterReverseArray;

public class SearchAfterReverseArray {

    public int search(int[] nums, int target) {
        // write code here
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                k = i;
            }
        }

        int left = binarySearch(nums, target, 0, k);
        int right = binarySearch(nums, target, k + 1, nums.length);
        return left == -1 ? right : left;
    }

    int binarySearch(int[] nums, int target, int left, int right) {
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
