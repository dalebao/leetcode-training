package NC50ReverseKGroup;

import util.ListNode;

public class ReverseKGroupSolution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // write code here
        ListNode node = head;
        for (int i = 0; i < k; i++) {
            if (node == null) {
                return head;
            }
            node = node.next;
        }
        // 反转结果
        ListNode res = reverse(head, node);
        head.next = reverseKGroup(node, k);
        return res;
    }

    public ListNode reverse(ListNode head, ListNode node) {
        ListNode pre = null;
        ListNode nxt = head;
        ListNode cur = head;
        while (cur != node) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
