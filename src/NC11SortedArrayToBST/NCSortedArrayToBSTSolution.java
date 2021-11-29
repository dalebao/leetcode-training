package NC11SortedArrayToBST;

import util.TreeNode;

public class NCSortedArrayToBSTSolution {

    public TreeNode sortedArrayToBST(int[] num) {
        // write code here
        if (num.length == 0) {
            return null;
        }
        return build(num, 0, num.length - 1);
    }

    TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);
        return root;
    }
}
