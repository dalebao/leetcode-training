package NC55LongestCommonPrefix;

public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        // write code here
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String base = strs[0];

        for (int i = 1; i < strs.length; i++) {
            base = commonPrefix(base, strs[i]);
        }
        return base;
    }

    public String commonPrefix(String str1, String str2) {
        int l = Math.min(str1.length(), str2.length());
        for (int i = 0; i < l; i++) {
            if (str2.charAt(i) != str1.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, l);
    }
}
