package NC17GetLongestPalindrome;

public class GetLongestPalindromeSolution {

    public int getLongestPalindrome(String A) {
        // write code here
        int max = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i; j < A.length(); j++) {
                if (isPalindrome(A, i, j)) {
                    max = Math.max(j - i + 1, max);
                }
            }
        }
        return max;
    }

    public boolean isPalindrome(String r, int left, int right) {
        while (left < right && r.charAt(left) == r.charAt(right)) {
            left--;
            right++;
        }
        return left == right || left - right == 1;
    }

}
