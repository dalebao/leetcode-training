package No41FirstMissingPositive;

public class FirstMissingPositiveSolution {

    //将 0 ~ num.length 的数据 恢复到 0->1 1->2 2->3
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
                //交换 i 与 num[i]-1 位置上的数
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

}
