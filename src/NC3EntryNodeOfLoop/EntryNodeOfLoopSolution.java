package NC3EntryNodeOfLoop;

import util.ListNode;

public class EntryNodeOfLoopSolution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode fast = pHead;
        ListNode slow = pHead;

        while (fast != null && slow != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
            if (fast == slow) {

                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        while (fast != pHead) {
            fast = fast.next;
            pHead = pHead.next;
        }
        return fast;
    }

}
