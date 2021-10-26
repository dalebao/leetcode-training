package No141HasCycle;

import util.ListNode;

public class HasCycleSolution {

    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode node1 = head;
        ListNode node2 = head.next;
        while (node1 != null && node2 != null){
            if (node1 == node2){
                return true;
            }
            node1 = node1.next;
            if(node2.next == null){
                return false;
            }
            node2 = node2.next.next;
        }
        return false;
    }
}
