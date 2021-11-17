package No109SortedListToBST;

import util.ListNode;
import util.TreeNode;

public class SortedListToBSTSolution {

    public TreeNode sortedListToBST(ListNode head) {
        return dfs(head, null);
    }

    public TreeNode dfs(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }

        ListNode fast = left;
        ListNode slow = left;
        while (fast.next != right && fast.next != right) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);

        root.left = dfs(left, slow);
        root.right = dfs(slow, right);
        return root;
    }
}
