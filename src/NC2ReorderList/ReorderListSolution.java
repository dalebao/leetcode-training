package NC2ReorderList;

import util.ListNode;

public class ReorderListSolution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
        }
        // reverse slow -> end
        ListNode pre = null;
        ListNode nex = slow.next;
        ListNode cur = slow.next;
        while (cur != null) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        slow.next = null;

        ListNode c = head;


    }


}
