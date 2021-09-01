package No235LowestCommonAncestor;

import util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> pAncestor = findNode(root, p);
        Queue<TreeNode> qAncestor = findNode(root, q);

        TreeNode tmp = null;

        while (!pAncestor.isEmpty() && !qAncestor.isEmpty()) {
            TreeNode e;
            if ((e = pAncestor.poll()).val == qAncestor.poll().val) {
                tmp = e;
            }
        }

        return tmp;
    }

    public Queue<TreeNode> findNode(TreeNode root, TreeNode p) {

        Queue<TreeNode> ancestor = new LinkedList<>();
        while (root != null && root.val != p.val) {
            ancestor.add(root);
            if (root.val > p.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        // 自己也是祖先
        ancestor.add(p);

        return ancestor;
    }
}
