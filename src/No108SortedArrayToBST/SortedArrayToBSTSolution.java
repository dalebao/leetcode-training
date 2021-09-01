package No108SortedArrayToBST;

import util.TreeNode;

public class SortedArrayToBSTSolution {

    public TreeNode sortedArrayToBST(int[] nums) {
        //root index = nums.length / 2
        // left 0 ,index - 1
        // right index + 1, right
        return buildNode(0, nums.length, nums);
    }

    public TreeNode buildNode(int start, int end, int[] nums) {
        if (start >= end) {
            return new TreeNode(nums[start]);
        }
        int rootIndex = (end + start) / 2;
        int rootVal = nums[rootIndex];


        return new TreeNode(rootVal, buildNode(0, rootIndex - 1, nums), buildNode(rootIndex + 1, end, nums));
    }
}
