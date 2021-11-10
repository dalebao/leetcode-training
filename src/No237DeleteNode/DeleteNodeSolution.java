package No237DeleteNode;

import util.ListNode;

public class DeleteNodeSolution {
    public void deleteNode(ListNode node) {

        while (node.next != null){
            node.val = node.next.val;

            if (node.next.next == null){
                node.next = null;
                break;
            }
            node = node.next;
        }

    }
}
