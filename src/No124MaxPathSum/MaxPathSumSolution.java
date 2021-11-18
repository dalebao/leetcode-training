package No124MaxPathSum;

import util.TreeNode;

public class MaxPathSumSolution {

    int maxPathSum = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {
        getPathSum(root);
        return maxPathSum;
    }

    public int getPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int pathValue = root.val;
        int pathLeft = Math.max(getPathSum(root.left), 0);
        int pathRight = Math.max(getPathSum(root.right), 0);

        int nowPoint = pathLeft + pathValue + pathRight;

        maxPathSum = Math.max(nowPoint, maxPathSum);
        // 选择最大的路径，不能同时选左右两个节点
        return root.val + Math.max(pathLeft,pathRight);
    }
}
