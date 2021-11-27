package NC37MergeQujian;

import common.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeQujianSolution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, (Comparator.comparingInt(o -> o.start)));
        ArrayList<Interval> res = new ArrayList<>();

        for (int i = 0; i < intervals.size(); ) {
            int j = i + 1;
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            while (j < intervals.size()) {
                if (intervals.get(j).start <= end && intervals.get(j).start >= start) {
                    end = Math.max(intervals.get(j).end, end);
                    j++;
                } else {
                    break;
                }
            }
            Interval ii = new Interval(start, end);
            res.add(ii);
            i = j;
        }
        return res;
    }


}
