package NC22MergeTwoSortedArr;

public class MergeTwoSortedArr {
    public void merge(int A[], int m, int B[], int n) {
        n--;
        m--;
        int aLen = m + n;
        while (m > 0 && n > 0) {
            if (A[m] > B[n]) {
                A[aLen] = A[m];
                aLen--;
                m--;
            } else {
                A[aLen] = B[n];
                aLen--;
                n--;
            }
        }
        if (m > 0) {
            for (int i = m; i > 0; i--) {
                A[aLen] = A[i];
            }
        }
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                A[aLen] = B[i];
            }
        }
    }
}
