package NC31FirstNotRepeatingChar;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingCharSolution {
    public int FirstNotRepeatingChar(String str) {
        int[] r = new int[128];
        for (int i = 0; i < str.length(); i++) {
            r[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (r[str.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
}
