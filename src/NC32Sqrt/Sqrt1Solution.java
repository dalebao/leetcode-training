package NC32Sqrt;

public class Sqrt1Solution {
    public int sqrt(int x) {
        // write code here
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        int mid = 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
