package No617MergeTrees;

import util.TreeNode;

public class MergeTreesSolution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode node = new TreeNode();
         if (root1 != null && root2 != null){
             node.val = root1.val + root2.val;
             node.left = mergeTrees(root1.left,root2.left);
             node.right = mergeTrees(root1.right,root2.right);
             return node;
         }
         node = root1 == null ? root2 : root1;
         return node;
    }
}
