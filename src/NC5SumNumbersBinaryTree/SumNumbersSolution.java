package NC5SumNumbersBinaryTree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumNumbersSolution {

    public int sumNumbers(TreeNode root) {
        // write code here

        return preOrder(root, 0);
    }

    int preOrder(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return preOrder(root.left, sum) + preOrder(root.right, sum);
    }


}
