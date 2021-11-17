package Mianshi04SortedArrayToBST;

import util.TreeNode;

public class SortedArrayToBSTSolution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArray2Bst(nums, 0, nums.length);
    }

    public TreeNode sortedArray2Bst(int[] nums, int left, int right) {
        if (nums.length == 0 || left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.right = sortedArray2Bst(nums, mid + 1, right);
        root.left = sortedArray2Bst(nums, left, mid - 1);
        return root;
    }
}
