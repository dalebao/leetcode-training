package NC4HasCycle;

import util.ListNode;

public class HasCycleSolution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
