package NC49LongestValidParentheses;

public class LongestValidParenthesesSolution {
    public int longestValidParentheses(String s) {
        // write code here
        int lc = 0, rc = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lc++;
            } else {
                rc++;
            }
            if (rc == lc) {
                max = Math.max(max, lc * 2);
            }
            if (rc > lc) {
                lc = 0;
                rc = 0;
            }
        }
        lc = 0;
        rc = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ')') {
                rc++;
            } else {
                lc++;
            }
            if (rc == lc) {
                max = Math.max(max, lc * 2);
            }
            if (lc > rc) {
                lc = 0;
                rc = 0;
            }
        }
        return max;
    }
}
