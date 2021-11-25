package NC156FoundOnceNumber;

import java.util.HashMap;
import java.util.Set;

public class FoundOnceNumberSolution {


    public int foundOnceNumber(int[] arr, int k) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();//key存数字，value表示是否出现过
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        Set<Integer> set = map.keySet();
        for(int num : set){
            if(map.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}
