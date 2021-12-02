package Nc25DeleteDuplicates;

import util.ListNode;

public class DeleteDuplicatesSolution {

    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode cur = head;

        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

}
