package NC72Mirror;

import util.TreeNode;

public class MirrorSolution {
    public TreeNode Mirror(TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return null;
        }

        TreeNode left = Mirror(pRoot.left);
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = left;
        return pRoot;
    }
}
