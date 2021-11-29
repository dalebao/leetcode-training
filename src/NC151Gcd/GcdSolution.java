package NC151Gcd;

public class GcdSolution {
    public int gcd(int a, int b) {
        // write code here
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
