package NC75FindNumsAppearOnce;

import java.util.Arrays;

public class FindNumsAppearOnceSolution {

    public int[] FindNumsAppearOnce(int[] array) {
        // write code here
        Arrays.sort(array);
        int[] res = new int[2];
        int n = 0;
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] != array[i + 1]) {
                res[n] = array[i];
                n++;
                i++;
            } else {
                i = i + 2;
            }
        }
        if (i < array.length) {
            res[n] = array[i];
        }
        return res;
    }
}
