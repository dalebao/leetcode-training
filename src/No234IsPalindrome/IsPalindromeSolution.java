package No234IsPalindrome;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IsPalindromeSolution {

    public boolean isPalindrome(ListNode head) {
        List<Integer> intVals = new ArrayList<>();
        int i = 0;
        while (head != null) {
            intVals.add(head.val);
            head = head.next;
        }
        return isPalindrome(intVals.toArray(new Integer[0]));
    }


    public boolean isPalindrome(Integer[] intArr) {
        int i = 0;
        int j = intArr.length - 1;
        while (i <= j) {
            if (intArr[i] != intArr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
