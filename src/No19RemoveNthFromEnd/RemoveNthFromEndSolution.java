package No19RemoveNthFromEnd;

import util.ListNode;

public class RemoveNthFromEndSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while (fast != null){
            fast = fast.next;
            i++;
            if (i>n){
                slow = slow.next;
            }
        }
        if (i<n){
            return null;
        }
        slow.next = slow.next.next;
        return head;
    }
}
