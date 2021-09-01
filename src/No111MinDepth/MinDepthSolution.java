package No111MinDepth;

import util.TreeNode;

public class MinDepthSolution {

    public int minDepth(TreeNode root) {

        return nodeNum(root);
    }

    public int nodeNum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }

        int nodeNum = Integer.MAX_VALUE;
        if (root.left != null){
            nodeNum = Math.min(nodeNum(root.left), nodeNum);
        }
        if (root.right != null){
            nodeNum = Math.min(nodeNum(root.right), nodeNum);
        }
        return nodeNum + 1;
    }
}
