package NC6MaxPathSum;

import util.TreeNode;

public class MaxPathSumSolution {

    int maxSum = 0;

    public int maxPathSum(TreeNode root) {
        // write code here
        if(root != null){
            maxSum = root.val;
        }
        maxGain(root);
        return maxSum;
    }

    int maxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftNodeVal = Math.max(0, maxGain(root.left));

        int rightNodeVal = Math.max(0, maxGain(root.right));

        int nowVal = root.val + leftNodeVal + rightNodeVal;
        // 左到右
        maxSum = Math.max(nowVal, maxSum);

        return root.val + Math.max(leftNodeVal, rightNodeVal);
    }
}
