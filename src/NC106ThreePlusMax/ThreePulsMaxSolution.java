package NC106ThreePlusMax;

import java.util.Arrays;

public class ThreePulsMaxSolution {
    public long solve(int[] A) {
        // write code here
        if (A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        long res = (long) A[0] * A[1] * A[A.length - 1];
        long res2 = (long) A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        return Math.max(res, res2);
    }
}
