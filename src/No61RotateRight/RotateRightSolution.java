package No61RotateRight;

import util.ListNode;

public class RotateRightSolution {

    public ListNode rotateRight1(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int len = 0;

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode cur = temp;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }

        ListNode fast = head;
        ListNode slow = head;
        while((k % len) > 0){
            k--;
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = temp;
        return res;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        if(k % len == 0){
            return temp;
        }
        while((k % len) > 0){
            k--;
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = temp;
        return res;
    }

}
