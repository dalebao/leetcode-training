package No110IsBalanced;

import util.TreeNode;

public class IsBalancedSolution {

    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }

    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);

        int rightDepth = getDepth(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            isBalanced = false;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
