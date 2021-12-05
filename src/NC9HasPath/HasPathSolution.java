package NC9HasPath;

import util.TreeNode;

public class HasPathSolution {

    public boolean hasPathSum(TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return false;
        }

        return hasPath(root, sum);
    }

    public boolean hasPath(TreeNode root, int sum) {
        // write code here

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }

        return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
    }


}
