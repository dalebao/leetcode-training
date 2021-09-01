package No114PreorderTraversal;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversalSolution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        if (root == null) {
            return vals;
        }
        prePrint(root, vals);
        return vals;
    }

    public void prePrint(TreeNode root, List<Integer> vals) {
        vals.add(root.val);
        if (root.left != null) {
            prePrint(root.left, vals);
        }
        if (root.right != null) {
            prePrint(root.right, vals);
        }
    }

}
