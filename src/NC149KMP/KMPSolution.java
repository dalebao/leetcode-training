package NC149KMP;

public class KMPSolution {
    public int kmp(String S, String T) {
        // write code here
        int ans = 0;
        char[] charS = S.toCharArray();
        char[] charT = T.toCharArray();
        int[] next = getNextChar(charS);
        int i = 1, j = 1;
        while (j <= T.length() && i <= S.length()) {
            if (i == 0 || charT[j - 1] == charS[i - 1]) {
                ++i;
                ++j;

            } else {
                i = next[i];
            }
            if (i > S.length()) {
                ans++;
                i = next[i];
            }
        }
        return ans;
    }

    /**
     * 需要把最后以一位+1的next计算出来
     * a b a b
     * 0 1 1 2 3
     * next[j]的含义是：在子串的第j个字符于主串发生失配时，则跳到子串的next[j]位置重新于主串当前位置进行比较。
     *
     * @param T
     * @return
     */
    public static int[] getNextChar(char[] T) {
        int len = T.length;
        int[] next = new int[len + 2];
        int i = 1, j = 0;
        next[1] = 0;
        while (i <= len) {
            if (j == 0 || T[i - 1] == T[j - 1]) {
                ++i;
                ++j;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }
}
