package NC120NumberOf1;

public class NumberOf1Solution {

    public int NumberOf1(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }


}
