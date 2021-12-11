package No45CanJump;

public class CanJump2Solution {

    public int jump(int[] nums) {
        int maxPosition = 0;
        int step = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                step++;
            }
        }
        return step;
    }
}
