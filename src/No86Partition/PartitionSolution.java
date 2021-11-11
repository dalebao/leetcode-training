package No86Partition;

import util.ListNode;

public class PartitionSolution {

    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode min = new ListNode(0);
        ListNode minTemp = min;

        ListNode plus = new ListNode(0);
        ListNode plusTemp = plus;

        ListNode cur = head;

        while (cur != null) {
            if (cur.val >= x) {
                plusTemp.next = cur;
                plusTemp = plusTemp.next;
            } else {
                minTemp.next = cur;
                minTemp = minTemp.next;
            }
            cur = cur.next;
        }
        plusTemp.next = null;
        minTemp.next = plus.next;

        return min.next;
    }

}
