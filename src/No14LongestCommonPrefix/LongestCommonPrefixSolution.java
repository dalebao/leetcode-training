package No14LongestCommonPrefix;

public class LongestCommonPrefixSolution {

    public String longestCommonPrefix(String[] strs) {
        int minLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLen = Math.min(strs[i].length(), minLen);
        }
        String longest = "";
        for (int i = 0; i < minLen; i++) {
            char tmp = strs[0].charAt(i);
            boolean flag = false;
            for (int j = 1; j < strs.length; j++) {
                if (tmp != strs[j].charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            longest = longest + tmp;
        }
        return longest;
    }
}
