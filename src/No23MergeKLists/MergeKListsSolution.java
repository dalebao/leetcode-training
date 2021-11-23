package No23MergeKLists;

import util.ListNode;

public class MergeKListsSolution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode t = lists[0];
        for (int i = 1; i < lists.length; i++) {
            t = mergeTwoList(t, lists[i]);
        }
        return t;
    }

    ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode tmp = new ListNode(0);
        ListNode t = tmp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                t.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                t.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            t = t.next;
        }
        if (list1 != null) {
            t.next = list1;
        } else {
            t.next = list2;
        }

        return tmp.next;
    }

}
