package No1013CanThreePartsEqualSum;

import java.util.Arrays;

public class CanThreePartsEqualSumSolution {

    public boolean canThreePartsEqualSum(int[] arr) {
        int all = 0;
        for (int i = 0; i < arr.length; i++) {
            all += arr[i];
        }
        if (all % 3 != 0) {
            return false;
        }

        int threePartVal = all / 3;

        int count = 0;
        int i = 0;
        int tmp = 0;
        while (i < arr.length) {
            tmp += arr[i];
            if (tmp == threePartVal) {
                count++;
                tmp = 0;
            }
            i++;
        }
        return count >= 3;
    }
}
