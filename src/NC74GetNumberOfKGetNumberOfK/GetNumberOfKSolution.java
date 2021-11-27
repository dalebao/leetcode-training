package NC74GetNumberOfKGetNumberOfK;

public class GetNumberOfKSolution {
    public int GetNumberOfK(int[] array, int k) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1 && array[0] == k) {
            return 1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == k) {
                int tmp = mid;
                while (tmp >= left && array[tmp] == k) {
                    tmp--;
                }
                int mostLeft = tmp + 1;
                tmp = mid;
                while (tmp <= right && array[tmp] == k) {
                    tmp++;
                }
                int mostRight = tmp - 1;
                return mostRight - mostLeft;
            } else if (array[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
