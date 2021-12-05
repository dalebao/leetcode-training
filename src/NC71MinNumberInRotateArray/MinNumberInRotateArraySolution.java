package NC71MinNumberInRotateArray;

public class MinNumberInRotateArraySolution {

    public int minNumberInRotateArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] < array[right]) {
                return array[left];
            }
            int mid = left + (right - left) / 2;
            if (array[mid] > array[right]) {
                right = mid;
            } else if (array[mid] < array[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return array[left];
    }
}
