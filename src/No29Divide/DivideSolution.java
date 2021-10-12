package No29Divide;

public class DivideSolution {


    public int divide(int dividend, int divisor) {
        if (divisor == 0 || dividend == 0) {
            return 0;
        }
        boolean negative = false;
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            negative = true;
        }
        int i = 0;
        if (dividend <= Integer.MIN_VALUE){
            dividend = Integer.MAX_VALUE;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            i++;
        }
        return negative ? i : -i;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        DivideSolution divideSolution = new DivideSolution();
        System.out.println(divideSolution.divide(dividend, divisor));
    }
}
