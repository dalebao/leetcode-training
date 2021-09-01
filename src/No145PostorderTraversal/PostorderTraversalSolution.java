package No145PostorderTraversal;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostorderTraversalSolution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> vals = new ArrayList<>();
        if (root == null){
            return vals;
        }

        Deque<TreeNode> treeNodes = new LinkedList<>();
        TreeNode prev = null;
        while (root != null || !treeNodes.isEmpty()){
            // 将 root 的left node 推入栈中
            while (root!= null){
                treeNodes.push(root);
                root = root.left;
            }
            // 取出最左边的 left node
            root = treeNodes.pop();
            // 如果存在 右节点，或者当前节点等于上一个节点
            if (root.right == null || root == prev){
                vals.add(root.val);
                // 将当前节点指到上一个节点
                prev = root;
                root = null;
            }else{
                // 将右节点推入栈中
                treeNodes.push(root);
                root = root.right;
            }
        }
        return vals;
    }
}
