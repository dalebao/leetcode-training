package NC23PartitionListNode;

import util.ListNode;

public class PartitionListNodeSolution {

    public ListNode partition(ListNode head, int x) {
        // write code here
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;

        while (head != null) {
            if (head.val < x) {
                smallHead.next = head;
                smallHead = smallHead.next;
            } else {
                largeHead.next = head;
                largeHead = largeHead.next;
            }
            head = head.next;
        }
        largeHead.next = null;
        smallHead.next = large.next;

        return small.next;
    }
}
