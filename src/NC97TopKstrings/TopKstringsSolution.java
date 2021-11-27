package NC97TopKstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKstringsSolution {

    public String[][] topKstrings(String[] strings, int k) {
        // write code here
        if (k == 0) {
            return new String[][]{};
        }
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        for (String string : strings) {
            if (stringIntegerHashMap.containsKey(string)) {
                Integer a = stringIntegerHashMap.get(string);
                stringIntegerHashMap.put(string, a + 1);
            } else {
                stringIntegerHashMap.put(string, 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(stringIntegerHashMap.entrySet());
        Collections.sort(list, (o1, o2) ->
                (o1.getValue().compareTo(o2.getValue()) == 0 ? o1.getKey().compareTo(o2.getKey()) : o2.getValue().compareTo(o1.getValue())));
        String[][] res = new String[k][2];
        for (int i = 0; i < k; i++) {
            res[i][0] = list.get(i).getKey();
            res[i][1] = String.valueOf(list.get(i).getValue());
        }
        return res;
    }
}
