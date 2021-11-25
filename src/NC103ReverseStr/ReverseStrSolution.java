package NC103ReverseStr;

public class ReverseStrSolution {
    public String solve(String str) {
        // write code here
        int left = 0;
        int right = str.length() - 1;
        char[] res = new char[str.length()];

        while (left < right) {
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);
            res[right] = leftChar;
            res[left] = rightChar;
            left++;
            right--;
        }
        if (left == right) {
            res[left] = str.charAt(left);
        }

        return new String(res);
    }

    public String solve1(String str) {
        char[] res = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            res[str.length() - 1 - i] = str.charAt(i);
        }
        return new String(res);
    }
}
