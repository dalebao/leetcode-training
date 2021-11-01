package No461HammingDistance;

public class HammingDistanceSolution {

    public int hammingDistance(int x, int y) {
        int r = x^y;
        int count = 0;
        while (r>0){
            r = r & (r-1);
            count ++;
        }
        return count;
    }
}
