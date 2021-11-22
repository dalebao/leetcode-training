package No119YanghuiGetRow;

import java.util.ArrayList;
import java.util.List;

public class YanghuiGetRowSolution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(res.get(j - 1) + res.get(j));
                }
            }
            res = cur;
        }
        return res;
    }
}
