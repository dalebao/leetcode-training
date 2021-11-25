package NC40AddInList;

import util.ListNode;

import java.util.Stack;

public class AddInListSolution {
    public ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (head1 != null) {
            stack1.push(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            stack2.push(head2.val);
            head2 = head2.next;
        }

        Stack<Integer> res = new Stack<>();

        int p = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            int v = stack1.pop() + stack2.pop() + p;
            p = v / 10;
            v = v % 10;
            res.push(v);
        }

        while (!stack1.isEmpty()) {
            int v = stack1.pop() + p;
            p = v / 10;
            v = v % 10;
            res.push(v);
        }
        while (!stack2.isEmpty()) {
            int v = stack2.pop() + p;
            p = v / 10;
            v = v % 10;
            res.push(v);
        }
        if (p != 0) {
            res.push(p);
        }

        ListNode h = new ListNode(0);
        ListNode tmp = h;
        while (!res.isEmpty()) {
            tmp.next = new ListNode(res.pop());
            tmp = tmp.next;
        }
        return h.next;
    }
}
