package NC52IsValidKuohao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsValidKuohaoSolution {
    public boolean isValid(String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character c = stack.peek();
                if (c == null) {
                    return false;
                }
                if ((c == '[' && s.charAt(i) == ']') || (c == '(' && s.charAt(i) == ')') || (c == '{' && s.charAt(i) == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
