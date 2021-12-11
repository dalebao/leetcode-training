package No567CheckInclusion;

import java.util.Arrays;

public class CheckInclusionSolution {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int n = s1.length();
        int[] s1Feq = new int[26];
        int[] s2Feq = new int[26];

        for (int i = 0; i < n; i++) {
            s1Feq[s1.charAt(i) - 'a']++;
            s2Feq[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Feq, s2Feq)) {
            return true;
        }

        for (int i = n; i < s2.length(); i++) {
            s2Feq[s2.charAt(i) - 'a']++;
            s2Feq[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(s1Feq, s2Feq)) {
                return true;
            }
        }
        return false;
    }
}
