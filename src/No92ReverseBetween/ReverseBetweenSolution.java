package No92ReverseBetween;

import util.ListNode;

import javax.swing.*;

public class ReverseBetweenSolution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) {
            return reverseN(head, right);
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    ListNode successors = null;

    // 反转前n个
    public ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successors = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successors;
        return last;
    }

}
