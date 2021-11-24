package NC102LowestCommonAncestor;

import util.TreeNode;

public class NCLowestCommonAncestorSolution {
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        return helper(root, o1, o2).val;
    }

    TreeNode helper(TreeNode root, int o1, int o2) {
        if (root == null) {
            return null;
        }
        if (o1 == root.val || o2 == root.val) {
            return root;
        }

        TreeNode left = helper(root.left, o1, o2);
        TreeNode right = helper(root.right, o1, o2);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }


        return root;
    }
}
