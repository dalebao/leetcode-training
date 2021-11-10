package No203RemoveElements;

import util.ListNode;

public class RemoveElementsSolution {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode cur = curr;

        while (cur.next != null) {
            if (cur.next.val == val) {
               cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return curr.next ;
    }


    public ListNode removeElements1(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
}
