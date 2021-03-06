package No1367IsSubPath;

import util.ListNode;
import util.TreeNode;

public class IsSubPathSolution {

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSub(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean isSub(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null || head.val != root.val) {
            return false;
        }
        return isSub(head.next, root.left) || isSub(head.next, root.right);
    }
}
