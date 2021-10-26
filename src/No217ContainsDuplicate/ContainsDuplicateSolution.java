package No217ContainsDuplicate;

import java.util.HashSet;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> r = new HashSet<>();
        for (int num : nums) {
            if (r.contains(num)){
                return true;
            }
            r.add(num);
        }
        return false;
    }
}
