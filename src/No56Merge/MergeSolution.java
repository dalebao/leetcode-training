package No56Merge;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSolution {

    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        Arrays.sort(intervals, Comparator.comparing(ints -> ints[0]));
        int[][] res = new int[length][2];
        int m = 0;
        for (int i = 0; i < length; ) {
            int j = i + 1;
            int max = intervals[i][1];
            int min = intervals[i][0];
            while (j < length) {
                if ((max >= intervals[j][0] && min <= intervals[j][1]) || (min <= intervals[j][1] && max >= intervals[j][0])) {
                    max = Math.max(intervals[j][1], max);
                    min = Math.min(intervals[j][0], min);
                    j++;
                } else {
                    break;
                }
            }
            int[] r = new int[2];
            r[0] = min;
            r[1] = max;
            res[m++] = r;
            i = j;
        }
        return Arrays.copyOf(res, m);
    }


}
