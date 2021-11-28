package NC62IsBalancedTree;

import util.TreeNode;

public class IsBalancedSolution {
    boolean isBalance = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        treeDepth(root);
        return isBalance;
    }

    int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = treeDepth(root.left);
        int r = treeDepth(root.right);

        if (Math.abs(l - r) > 1) {
            isBalance = false;
        }
        return Math.max(l, r) + 1;
    }

}
