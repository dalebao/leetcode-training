package No114Flatten;

import util.TreeNode;

public class FlattenSolution {

    public void flatten(TreeNode root) {
        root = to(root);
    }

    TreeNode to(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tmp = root;
        // print root.val

        TreeNode temRight = root.right;

        // digui root.left
        if (root.left != null) {
            root.right = to(root.left);
            root.left = null;
            while (root.right != null) {
                root = root.right;
            }
        }
        // print root.right
        if (temRight != null) {
            root.right = to(temRight);
        }
        return tmp;
    }
}
