package No206ReverseList;

import util.ListNode;

public class ReverseListSolution {

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode rHead = head;
        ListNode next = null;
        ListNode pre = null;

        while (rHead.next != null){
            next = rHead.next;
            rHead.next = pre;
            pre = rHead;
            rHead = next;
        }
        rHead.next = pre;
        return rHead;
    }
}
