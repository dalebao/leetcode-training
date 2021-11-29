package NC96ListIsPail;

import util.ListNode;

public class ListIsPailSolution {


    public boolean isPail(ListNode head) {
        // write code here
        int length = 0;
        ListNode lenNode = head;
        while (lenNode != null) {
            lenNode = lenNode.next;
            length++;
        }
        int[] r = new int[length];
        lenNode = head;
        length = 0;
        while (lenNode != null) {
            r[length] = lenNode.val;
            lenNode = lenNode.next;
            length++;
        }

        int left = 0;
        int right = length - 1;

        while (left < right && r[left] == r[right]) {
            left++;
            right--;
        }
        return left == right || left - right == 1;
    }

}
