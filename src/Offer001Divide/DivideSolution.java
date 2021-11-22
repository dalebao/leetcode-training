package Offer001Divide;

public class DivideSolution {
    public int divide(int a, int b) {
        boolean flag = false;
        if ((a ^ b) < 0) {
            // 异号
            flag = true;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 0;
        int r = 0;
        while (res <= a) {
            res += b;
            r++;
        }
        return flag ? -(r - 1) : r - 1;
    }
}
