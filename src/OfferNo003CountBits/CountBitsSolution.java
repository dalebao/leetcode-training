package OfferNo003CountBits;

public class CountBitsSolution {
    public int[] countBits(int n) {
        int[] res = new int[n];
        for (int i = 0; i <= n; i++) {
            res[i] = countBit(i);
        }
        return res;
    }

    int countBit(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
