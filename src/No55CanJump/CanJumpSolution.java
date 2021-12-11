package No55CanJump;

public class CanJumpSolution {

    public boolean canJump(int[] nums) {

        int maxLocation = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i <= maxLocation) {
                maxLocation = Math.max(maxLocation, nums[i] + i);
                if (maxLocation >= nums.length - 1) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean canJump1(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

}
