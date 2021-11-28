package NC16IsSymmetrical;

import util.TreeNode;

import java.util.*;

public class IsSymmetricalSolution {

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        TreeNode flag = new TreeNode(1001);
        while (!queue.isEmpty()) {
            List<Integer> r = new ArrayList<>();
            int levelSize = queue.size();
            while (levelSize > 0) {
                TreeNode treeNode = queue.poll();
                r.add(treeNode.val);
                if (treeNode == flag) {
                    continue;
                }
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                } else {
                    queue.offer(flag);
                }

                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                } else {
                    queue.offer(flag);
                }
                levelSize--;
            }
            if (!isPala(r.toArray(new Integer[]{}))) {
                return false;
            }
        }
        return true;
    }

    boolean isPala(Integer[] res) {
        int left = 0;
        int right = res.length - 1;
        while (left < right && Objects.equals(res[left], res[right])) {
            left++;
            right--;
        }
        return left == right || left - right == 1;
    }
}
