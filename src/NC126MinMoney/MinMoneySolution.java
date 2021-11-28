package NC126MinMoney;

import java.util.Arrays;

public class MinMoneySolution {
    // 错误截图方式 这种是
    public int minMoney(int[] arr, int aim) {
        // write code here
        Arrays.sort(arr);
        int j = arr.length - 1;
        int p = 0;
        int left = aim;
        while (j >= 0) {
            if (arr[j] < aim) {
                p += aim / arr[j];
                aim = aim % arr[j];
            }
            j--;
        }
        if (left > 0) {
            p++;
        }
        return left == aim ? -1 : p;
    }
}
