package No740DeleteAndEarn;

public class DeleteAndEarnSolution {
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int i = 0; i < nums.length; i++) {
            maxVal = Math.max(nums[i], maxVal);
        }

        int[] r = new int[maxVal + 1];
        for (int i = 0; i < nums.length; i++) {
            r[nums[i]] += nums[i];
        }

        int first = 0;
        int second = r[1];
        for (int i = 2; i < r.length; i++) {
            int tmp = second;
            second = Math.max(first + r[i], second);
            first = tmp;
        }
        return second;
    }
}
