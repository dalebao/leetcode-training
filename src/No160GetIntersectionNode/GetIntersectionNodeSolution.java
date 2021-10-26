package No160GetIntersectionNode;

import util.ListNode;

import java.util.HashSet;

public class GetIntersectionNodeSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> r = new HashSet<>();
        while (headA != null){
            r.add(headA);
            headA = headA.next;
        }

        while (headB != null){
            if (r.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
