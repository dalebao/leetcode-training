package No9IsPalindrome;

public class IsPalindromeSolution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        long r = 0L;

        while (x != 0) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return n == (int)r;
    }

    public static void main(String[] args) {
        IsPalindromeSolution isPalindromeSolution = new IsPalindromeSolution();
        System.out.println(isPalindromeSolution.isPalindrome(Integer.MAX_VALUE));;

    }
}
