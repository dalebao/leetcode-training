package NC95MLS;

import java.util.Arrays;

public class MLSSolution {
    public int MLS(int[] arr) {
        // write code here
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int max = 0;
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
