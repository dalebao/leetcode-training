package No942DiStringMatch;

public class DiStringMatchSolution {

    public int[] diStringMatch(String s) {
        int len = s.length();
        if (len == 0) {
            return new int[]{};
        }
        int[] res = new int[len + 1];
        for (int i = 0; i < len + 1; i++) {
            res[i] = i;
        }
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'D') {
                int j = i;

                while (j < len) {
                    int tmp = res[j];
                    res[j] = res[len];
                    res[len] = tmp;
                    j++;
                }
            }

        }

        return res;
    }

    public int[] tanxindiStringMatch(String S) {
        int N = S.length();
        // 低位为0 高位为 N
        // 遇到I 设置为0
        // 遇到D 设置为N
        // 然后累加即可
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }


}
