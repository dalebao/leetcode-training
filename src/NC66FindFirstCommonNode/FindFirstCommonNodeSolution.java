package NC66FindFirstCommonNode;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class FindFirstCommonNodeSolution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        boolean p1chang = false;
        boolean p2change = false;
        while (p1 != p2) {
            if (p1 == null) {
                if (p1chang) {
                    break;
                }
                p1chang = true;
                p1 = pHead2;
            } else {
                p1 = p1.next;
            }

            if (p2.next == null) {
                if (p2change) {
                    break;
                }
                p2change = true;
                p2 = pHead1;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
