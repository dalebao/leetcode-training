package No1221BalancedStringSplit;

public class BalancedStringSplitSolution {

    public int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lCount++;
            } else {
                rCount++;
            }
            if (lCount == rCount) {
                count++;
                lCount = 0;
                rCount = 0;
            }
        }
        return count == 0 ? 1 : count;
    }
}
