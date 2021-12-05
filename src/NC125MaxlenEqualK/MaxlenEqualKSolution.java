package NC125MaxlenEqualK;

import java.util.HashMap;

public class MaxlenEqualKSolution {

    public int maxlenEqualK(int[] arr, int k) {
        // write code here
        // s[i] 表示 0 - i 的累加值
        // 当 s[i]-s[j] = k 时，表明 j 到 i 之间的值累加等于k
        // 当 存在 s[j] = s[i]-k 时 i - j 为距离
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, -1);
        int len = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (s.containsKey(sum - k)) {
                len = Math.max(len, i - s.get(sum - k));
            } else {
                s.put(sum, i);
            }
        }
        return len;
    }
}
