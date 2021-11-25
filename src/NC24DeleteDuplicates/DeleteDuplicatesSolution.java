package NC24DeleteDuplicates;

import util.ListNode;

import java.util.List;

public class DeleteDuplicatesSolution {

    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                ListNode tmp = cur.next;
                while (tmp != null && cur.val == tmp.val) {
                    tmp = tmp.next;
                }
                pre.next = tmp;
                cur = tmp;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
