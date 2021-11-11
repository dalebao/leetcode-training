package No24SwapPairs;

import util.ListNode;

public class SwapPairsSolution {


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode tmp = head;
        ListNode nxt = head.next.next;
        head = head.next;
        head.next = tmp;

        head.next.next = swapPairs(nxt);
        return head;
    }

}
