package No62UniquePaths;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UniquePathsSolution {

    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int i = n, y = 1; y < m; i++, y++) {
            ans = ans * i / y;
        }
        return (int) ans;
    }


}
