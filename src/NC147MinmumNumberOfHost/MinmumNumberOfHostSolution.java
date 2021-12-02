package NC147MinmumNumberOfHost;

import java.util.Arrays;
import java.util.Comparator;

public class MinmumNumberOfHostSolution {
    public int minmumNumberOfHost(int n, int[][] startEnd) {
        // write code here
        int[] start = new int[startEnd.length];
        int[] end = new int[startEnd.length];

        for (int i = 0; i < startEnd.length; i++) {
            start[i] = startEnd[i][0];
            end[i] = startEnd[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int index = 0;
        int res = 0;
        for (int i = 0; i < start.length; i++) {
            if (start[i] >= end[index]) {
                index++;
            } else {
                res++;
            }
        }
        return res;
    }
}
