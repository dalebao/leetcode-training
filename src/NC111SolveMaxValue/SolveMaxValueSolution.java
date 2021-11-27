package NC111SolveMaxValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SolveMaxValueSolution {


    public String solve(int[] nums) {
        // write code here
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(String.valueOf(nums[i]));
        }
        res.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        if (Objects.equals(res.get(0), "0")) {
            return "0";
        }
        StringBuilder r = new StringBuilder();
        for (String re : res) {
            r.append(re);
        }

        return r.toString();
    }
}
