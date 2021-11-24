package NC41MaxLengthNoDuplicateSubArr;

public class MaxLengthSolution {
    public int maxLength(int[] arr) {
        // write code here
        int res = 0;
        int tmp = 0;
        for (int right = 0; right < arr.length; right++) {
            int left = right - 1;
            while (left >= 0 && arr[left] != arr[right]) {
                left--;
            }
            // right - left
            tmp = tmp < right - left ? tmp + 1 : right - left;
            res = Math.max(tmp, res);
        }
        return res;
    }
}
