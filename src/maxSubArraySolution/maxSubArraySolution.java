package maxSubArraySolution;

public class maxSubArraySolution {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1};
        System.out.println(maxSubArray2(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tmpMax = 0;
                int m = i;
                while (m <= j) {
                    tmpMax += nums[m];
                    m++;
                }
                if (tmpMax > max) {
                    max = tmpMax;
                }
            }
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int n = nums[0];
        int res = 0;
        for (int num : nums) {
            if (res > 0) {
                res += num;
            } else {
                res = num;
            }
            n = Math.max(res, n);
        }
        return n;
    }
}
