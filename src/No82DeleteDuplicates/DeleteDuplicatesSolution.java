package No82DeleteDuplicates;

import util.ListNode;

public class DeleteDuplicatesSolution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode h = new ListNode(0);
        ListNode tmp = h;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            if (fast.val == fast.next.val) {
                int x = fast.val;
                while (fast != null && fast.val == x) {
                    fast = fast.next.next;
                }
            } else {
                tmp.next = fast;
                tmp = tmp.next;
                fast = fast.next;
            }

        }
        return h.next;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
