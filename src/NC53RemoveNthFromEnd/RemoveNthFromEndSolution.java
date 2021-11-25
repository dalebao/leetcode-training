package NC53RemoveNthFromEnd;

import util.ListNode;

public class RemoveNthFromEndSolution {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }

        ListNode slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
