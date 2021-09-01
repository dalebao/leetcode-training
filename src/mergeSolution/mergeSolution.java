package mergeSolution;

import java.util.Arrays;

public class mergeSolution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = n + m - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                p--;
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
                p--;
            }
        }

        for (int k = 0; k <= j; k++) {
            nums1[k] = nums2[k];
        }
    }
}
