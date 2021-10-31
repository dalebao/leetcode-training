package No338CountBits;

public class CountBitsSolution {
    public int[] countBits(int n) {
            int[] bits = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                bits[i] = countOnes(i);
            }
            return bits;
        }



    public int countOnes(int x) {
            int ones = 0;
            while (x > 0) {
                x &= (x - 1);
                ones++;
            }
            return ones;
        }


    public static void main(String[] args) {
        CountBitsSolution countBitsSolution = new CountBitsSolution();
        countBitsSolution.countBits(8);
    }
}
